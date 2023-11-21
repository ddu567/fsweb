package com.shop.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Wildcard;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shop.constant.ItemSellStatus;
import com.shop.dto.ItemSearchDto;
import com.shop.entity.Item;
import com.shop.entity.QItem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

public class ItemRepositoryCustomImpl implements ItemRepositoryCustom{
    //Impl - implements 약어로 구현을 나타내는 용어
    // 프로그래밍에서 Impl 은 인터페이스나 추상클래스의 실제 구현체를 나타내는 클래스
    private JPAQueryFactory queryFactory;
    //동적쿼리를 생성하기 위해서 JPAQueryFactory 선언
    public ItemRepositoryCustomImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }
    //JPAQueryFactory의 생성자로 EntityManager 객체를 넣어줌

    private BooleanExpression searchSellStatusEq(ItemSellStatus searchSellStatus){
        return searchSellStatus == null ? null : QItem.item.itemSellStatus.eq(searchSellStatus);
    }
// 판매상품 조건이 전체(null) 일때 null리턴  결과값이 null 이면 where 조건은 무시

    private BooleanExpression regDtsAfter(String searchDateType){

        LocalDateTime dateTime = LocalDateTime.now();
        //dateTime 현재 시간
        if(StringUtils.equals("all", searchDateType) || searchDateType == null){
            return null;
        } else if(StringUtils.equals("1d", searchDateType)){
            dateTime = dateTime.minusDays(1);
        } else if(StringUtils.equals("1w", searchDateType)){
            dateTime = dateTime.minusWeeks(1);
        } else if(StringUtils.equals("1m", searchDateType)){
            dateTime = dateTime.minusMonths(1);
        } else if(StringUtils.equals("6m", searchDateType)){
            dateTime = dateTime.minusMonths(6);
        }
        return QItem.item.regTime.after(dateTime);
    }

    private BooleanExpression searchByLike(String searchBy, String searchQuery){
        if(StringUtils.equals("itemNm", searchBy)){
            return QItem.item.itemNm.like("%"+searchQuery+"%");
        }else if(StringUtils.equals("createBy", searchBy)){
            return QItem.item.createdBy.like("%" + searchQuery + "%");
        }
        return null;
    }



    @Override
    public Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable) {
        List<Item> content = queryFactory.selectFrom(QItem.item).where(regDtsAfter(itemSearchDto.getSearchDateType()), searchSellStatusEq(itemSearchDto.getSearchSellStatus()), searchByLike(itemSearchDto.getSearchBy(), itemSearchDto.getSearchQuery())).orderBy(QItem.item.id.desc()) // 아이템 id의 역순방향
                .offset(pageable.getOffset())// 페이지 시작 오프셋 설정
                .limit(pageable.getPageSize()) // 페이지의 크기를 설정
                .fetch(); // 쿼리를 실행하고 결과를 리스트로 반환

        // 토탈카운트 조회 - 상품의 총갯수를 조회
        long total = queryFactory.select(Wildcard.count).from(QItem.item) //테이블에서 카운트를 조회하는 쿼리
                .where(regDtsAfter(itemSearchDto.getSearchDateType()),searchSellStatusEq(itemSearchDto.getSearchSellStatus()), searchByLike(itemSearchDto.getSearchBy(), itemSearchDto.getSearchQuery())).fetchOne()  //카운트 결과를 단일값으로 반환
                ;
        // Wildcard.count - QueryDsl 에서 제공하는 쿼리 결과의 행 수

        return new PageImpl<>(content, pageable, total);
    }
}
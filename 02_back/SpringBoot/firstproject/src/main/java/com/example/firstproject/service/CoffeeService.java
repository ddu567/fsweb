package com.example.firstproject.service;

import com.example.firstproject.dto.CoffeeDto;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class CoffeeService {
    public final CoffeeRepository coffeeRepository;

    public Iterable<Coffee> index() {
        return coffeeRepository.findAll();
    }


    public Coffee show(@PathVariable Long id) {return coffeeRepository.findById(id).orElse(null);}

    public Coffee create(CoffeeDto coffeeDto) {
        Coffee coffee = coffeeDto.toEntity();
        return coffeeRepository.save(coffee);

    }

    public Coffee update(Long id, CoffeeDto coffeeDto) {
        // 1. dto -> Entity
        Coffee coffee = coffeeDto.toEntity();
        // 2. target 조회
        Coffee target = coffeeRepository.findById(id).orElse(null);
        // 3. 잘못된 요청 처리
        if (target == null || id != coffee.getId()) {
            //400, 잘못된 요청 응답
            log.info("잘못된 요청! id: {}, coffee: {}", id, coffee.toString());
            return null;
        }

        // 4. 업데이트
        target.patch(coffee);
        Coffee updated = coffeeRepository.save(target);
        return updated;
    }

    public Coffee delete(Long id) {
        // 대상 찾기
        Coffee target = coffeeRepository.findById(id).orElse(null);
        // 잘못된 요청 처리
        if (target == null) {
            return null;
        }
        // 데이터 삭제 및 반환
        coffeeRepository.delete(target);
        return target;
    }

}

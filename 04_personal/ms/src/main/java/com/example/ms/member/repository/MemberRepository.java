package com.example.ms.member.repository;

import com.example.ms.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // <JpaRepository가 받아올 Entity 이름, 그 Entity의 PK type>
    // Entity 객체로 넘겨줘야 함

    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?)
    Member findByEmail(String email);
}

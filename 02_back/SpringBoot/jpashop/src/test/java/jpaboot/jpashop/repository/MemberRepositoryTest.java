package jpaboot.jpashop.repository;

import jpaboot.jpashop.domain.Member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;


// @RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {
@Autowired
MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void save() throws Exception {
        // given
        Member member = new Member();
        member.setUsername("memberA");
        // when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        // then
        // Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        // Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        assertEquals(findMember.toString(), member.toString(),"일치합니다.");
        System.out.println(findMember.toString());
        System.out.println(member.toString());
    }

    @Test
    void find() {

    }
}
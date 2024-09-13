package jpabook.jpashop;

import static org.junit.jupiter.api.Assertions.*;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setName("memberA");

        //when
        //Long saveId = memberRepository.save(member);
        //Member findMember = memberRepository.find(saveId);

        //then
        //Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        //Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
        //Assertions.assertThat(findMember).isEqualTo(member); //JPA 엔티티 동일성 보장

    }
}
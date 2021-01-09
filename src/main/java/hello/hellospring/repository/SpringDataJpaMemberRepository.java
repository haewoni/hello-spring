package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,MemberRepository {

    // Spring JPA 가 구현 불가능한것 
    // 메서드 이름으로 조회 기능 제공
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}

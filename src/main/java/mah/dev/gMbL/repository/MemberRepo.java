package mah.dev.gMbL.repository;

import mah.dev.gMbL.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member, Integer> {

    Optional<Member> findFirstByMail(String mail);
}

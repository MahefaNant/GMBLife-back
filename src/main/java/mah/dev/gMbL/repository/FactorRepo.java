package mah.dev.gMbL.repository;

import mah.dev.gMbL.entity.Factor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactorRepo extends JpaRepository<Factor, Integer> {
}

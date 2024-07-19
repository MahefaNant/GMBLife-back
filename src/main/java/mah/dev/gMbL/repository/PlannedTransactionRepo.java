package mah.dev.gMbL.repository;

import mah.dev.gMbL.entity.PlannedTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannedTransactionRepo extends JpaRepository<PlannedTransaction, Integer> {
}

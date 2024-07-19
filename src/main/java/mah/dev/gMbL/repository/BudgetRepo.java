package mah.dev.gMbL.repository;

import mah.dev.gMbL.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepo extends JpaRepository<Budget, Integer> {
}

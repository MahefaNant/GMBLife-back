package mah.dev.gMbL.repository;

import mah.dev.gMbL.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo  extends JpaRepository<Category, Integer> {
}

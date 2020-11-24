package repository;

import model.ModelExample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryExample extends JpaRepository<ModelExample, Long> {
}
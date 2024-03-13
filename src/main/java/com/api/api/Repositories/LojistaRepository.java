package com.api.api.Repositories;
import com.api.api.Entities.Lojistas;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface LojistaRepository extends JpaRepository<Lojistas, Long> {
}

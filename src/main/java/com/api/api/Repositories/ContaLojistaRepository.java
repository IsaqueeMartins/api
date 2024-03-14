package com.api.api.Repositories;
import com.api.api.Entities.ContaLojista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaLojistaRepository extends JpaRepository<ContaLojista, Long> {
}

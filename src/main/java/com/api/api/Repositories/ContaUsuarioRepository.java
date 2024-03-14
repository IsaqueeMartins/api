package com.api.api.Repositories;
import com.api.api.Entities.ContaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaUsuarioRepository extends JpaRepository<ContaUsuario, Long> {
}

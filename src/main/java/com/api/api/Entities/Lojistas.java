package com.api.api.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tb_lojistas")
@Data
public class Lojistas {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    @Column(unique = true)
    private String cpfcnpj;
    @Column(unique = true)
    private String email;
    private String senha;
}

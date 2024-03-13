package com.api.api.Entities;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "tb_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    @Column(unique = true)
    private String cpf; //utilizando string para o caso de 0 a esquerda ou em alguma futura mudanca que possa ocorrer a adicao de letras
    @Column(unique = true)
    private String email;
    private String senha;
}


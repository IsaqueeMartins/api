package com.api.api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table (name = "tb_contas")
@Data
public class ContaLojista {
    @Id
    @GeneratedValue
    private Long idConta;
    private Float saldo;
}

package br.com.fiap.mvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double preco;
    private boolean novo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFabricacao;
}

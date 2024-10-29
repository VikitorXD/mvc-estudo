package br.com.fiap.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class Veiculo {

    String nome;

    String marca;

    String cor;

    Double anoFabricacao;

}

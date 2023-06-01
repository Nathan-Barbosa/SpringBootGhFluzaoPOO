package br.com.api.ghfluzao.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "questoes")
@Data
public class Questao {
  @jakarta.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  @Column(length = 4000)
  private String enunciado;
  private int numero;
  @Column(length = 4000)
  private String figura;

  @OneToMany
  @JoinColumn(name = "codigo_questao")
  private List<Opcao> opcoes;

  @OneToMany
  @JoinColumn(name = "codigo_questao")
  private List<Gabarito> gabaritos; 
}

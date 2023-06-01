package br.com.api.ghfluzao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "gabaritos")
@Data
public class Gabarito {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  @Column(length = 4000)
  private String resposta;
}
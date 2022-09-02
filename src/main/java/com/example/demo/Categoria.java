package com.example.demo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Categoria implements Serializable {

  private static final long serialVersionUID = 1160267157482289107L;


  private Integer id;


  private String nombre;


  private String icono;
}

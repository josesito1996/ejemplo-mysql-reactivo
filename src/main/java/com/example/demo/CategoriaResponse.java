package com.example.demo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class CategoriaResponse implements Serializable {

  private static final long serialVersionUID = 6616100632113622053L;

  private String categoria;
  
  private String icono;
  
}

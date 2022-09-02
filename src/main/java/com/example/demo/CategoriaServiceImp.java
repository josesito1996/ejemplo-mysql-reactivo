package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;

@Service
public class CategoriaServiceImp implements CategoriaService {

  @Autowired
  private CategoriaRepository categoriaRepo;
  
  @Override
  public Observable<CategoriaResponse> listar() {
    
    return categoriaRepo.categorias().map(categoria ->{
      return CategoriaResponse.builder()
          .categoria(categoria.getNombre())
          .icono(categoria.getIcono())
          .build();
    });
  }

}

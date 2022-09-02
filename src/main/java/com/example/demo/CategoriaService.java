package com.example.demo;

import rx.Observable;

public interface CategoriaService {

  Observable<CategoriaResponse> listar();
  
}

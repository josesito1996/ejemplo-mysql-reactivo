package com.example.demo;

import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import rx.Observable;

@ExtendWith(MockitoExtension.class)
class EjemploReactivoMysqlApplicationTests {

  @Mock
  private CategoriaRepository categoriaRepo;

  @InjectMocks
  private CategoriaServiceImp service;

  @Test
  void test() {
    List<Categoria> categorias =
        Arrays.asList(Categoria.builder().id(1).icono("cafe").nombre("cafe").build());
    CategoriaResponse[] categoriasEspected =
        {CategoriaResponse.builder().icono("cafe").categoria("cafe").build()};
    
    when(categoriaRepo.categorias()).thenReturn(Observable.from(categorias));
    service.listar().test().assertCompleted().assertValues(categoriasEspected);
  }


}

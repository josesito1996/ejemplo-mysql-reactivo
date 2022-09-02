package com.example.demo;

import org.springframework.stereotype.Repository;
import com.github.davidmoten.rx.jdbc.Database;
import rx.Observable;

@Repository
public class CategoriaRepository {

  private Database database;

  public CategoriaRepository() {
    this.database = Database.from(Connector.connectionProvider);
  }

  public Observable<Categoria> categorias() {
    return database.select("select id,nombre,icono from categoria").autoMap(Categoria.class);
  }

}

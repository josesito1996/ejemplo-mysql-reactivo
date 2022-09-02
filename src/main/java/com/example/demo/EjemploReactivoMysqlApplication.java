package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EjemploReactivoMysqlApplication implements CommandLineRunner {

  @Autowired
  private CategoriaService categoriaService;
  
  public static void main(String[] args) {
    SpringApplication.run(EjemploReactivoMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    categoriaService.listar().subscribe(categoria -> log.info("CAtegoria {}", categoria));
  }

}

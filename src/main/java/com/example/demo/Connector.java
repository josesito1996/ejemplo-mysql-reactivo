package com.example.demo;

import com.github.davidmoten.rx.jdbc.ConnectionProvider;
import com.github.davidmoten.rx.jdbc.ConnectionProviderFromUrl;

public class Connector {

  private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/kiosko_app";
  private static final String DB_USER = "dev_frontend";
  private static final String DB_PASSWORD = "micontrasenaXD";

  static final ConnectionProvider connectionProvider = new ConnectionProviderFromUrl(DB_CONNECTION, DB_USER, DB_PASSWORD);
  
}

package easypet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Método que abre a conexão com o MySQL
    public Connection conectar() {
        try {
       
          return DriverManager.getConnection("jdbc:mysql://localhost:3306/easypet_db", "root", "root");
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
            return null;
        }
    }
}
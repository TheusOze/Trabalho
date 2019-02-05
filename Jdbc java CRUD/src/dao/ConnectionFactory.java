
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
     
    public Connection getConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/pessoas", "root", "1234");
        }catch(SQLException erro){
            throw new RuntimeException("Erro 1: "+erro);
        }
    }
}

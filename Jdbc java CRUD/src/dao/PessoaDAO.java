package dao;



import java.sql.Connection;
import model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PessoaDAO {
    private Connection con;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    
    public PessoaDAO(){
        con = new ConnectionFactory().getConexao();
    }
    public void Inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (Idade, Nome, cpf) VALUES (?,?,?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pessoa.getIdade());
            stmt.setString(2,pessoa.getNome() );
            stmt.setInt(3, pessoa.getCpf());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 2:"+erro);
        }
        
    }
   
    public void Alterar(Pessoa pessoa){
        String sql = "UPDATE pessoa SET Idade = ?, Nome = ?, cpf = ? WHERE ID = ?";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pessoa.getIdade());
            stmt.setString(2,pessoa.getNome());
            stmt.setInt(3, pessoa.getCpf());
            stmt.setInt(4, pessoa.getID());
            stmt.execute();
            stmt.close();
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 3:"+erro);
        }
        
    }
     public void Excluir(int valor){
        String sql = "DELETE FROM pessoa WHERE ID = " + valor;
        try{
            st = con.createStatement();
            st.execute(sql);
            st.close();
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 4:"+erro);
        }
    
     }
     
     public ArrayList<Pessoa> ListarTodos(){
         String sql = "SELECT * FROM pessoa";
         try{
             st = con.createStatement();
             rs = st.executeQuery(sql);
             while (rs.next()){
                 Pessoa pessoa = new Pessoa();
                 pessoa.setID(rs.getInt("ID"));
                 pessoa.setNome(rs.getString("Nome"));
                 pessoa.setCpf(rs.getInt("CPF"));
                 pessoa.setIdade(rs.getInt("Idade"));
                  lista.add(pessoa);
                 
                 
             }
         }catch(Exception erro){
             throw new RuntimeException("Erro 5:"+erro);      
         }
         return lista;
         
     }
     public ArrayList<Pessoa> ListarTodosSelect(String valor){
         String sql ="SELECT * FROM pessoa WHERE Nome LIKE '%"+valor+"%'";
         try{
             st = con.createStatement();
             rs = st.executeQuery(sql);
             while (rs.next()){
                 Pessoa pessoa = new Pessoa();
                 pessoa.setID(rs.getInt("ID"));
                 pessoa.setNome(rs.getString("Nome"));
                 pessoa.setCpf(rs.getInt("CPF"));
                 pessoa.setIdade(rs.getInt("Idade"));
                 lista.add(pessoa);
                 
                 
             }
         }catch(Exception erro){
             throw new RuntimeException("Erro 6:"+erro);      
         }
         return lista;
         
     }
}

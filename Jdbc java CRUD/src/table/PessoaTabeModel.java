
package table;
import model.Pessoa;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class PessoaTabeModel extends AbstractTableModel{
    
    public static final int COL_ID = 0;
    public static final int COL_Nome = 1;
    public static final int COL_Idade = 2;
    public static final int COL_cpf = 3;
    public ArrayList<Pessoa> lista;
    
    public PessoaTabeModel(ArrayList<Pessoa>l){
        lista = new ArrayList<Pessoa>(l);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
         Pessoa pessoa = lista.get(linhas);
         if(colunas == COL_ID) return pessoa.getID();
         if(colunas == COL_Nome) return pessoa.getNome();
         if(colunas == COL_Idade) return pessoa.getIdade();
         if(colunas == COL_cpf) return pessoa.getCpf();
         return "";
        
    }
    @Override
    public String getColumnName(int colunas){
        
         if(colunas == COL_ID) return "ID";
         if(colunas == COL_Nome) return "Nome";
         if(colunas == COL_Idade) return "Idade";
         if(colunas == COL_cpf) return "Cpf";
         return "";
        
        
    }
    
}

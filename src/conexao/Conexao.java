
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import view.Mensagens;

/**
 *
 * @author Eduardo
 */
public class Conexao {
    private static final String URL = "jdbc:sqlite:";
    public Connection abreConexao(){
        try{
            //Class.forName("com.mysql.jdbc.DriverManager");
            return DriverManager.getConnection(URL+System.getProperty("user.dir")+"\\src\\banco\\Banco.db");
        }
        catch (SQLException sqlex){
            System.out.println("Erro na conexão "+sqlex);
        }
        return null;
    }

    public static void fechaConexao(Connection conexao){
        try{
            conexao.close();
        }
        catch(SQLException sqlex){
            System.out.println("Erro na conexão: "+sqlex);
        }
    }
}

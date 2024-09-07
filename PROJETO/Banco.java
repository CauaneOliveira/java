import java.sql.*;

public class Banco {
    private Connection con;
    
    private Statement stat;

        
    Dados d = new Dados();
        
    public Banco(){
        try {
            String b_db="jdbc:mysql://localhost/Banco";
            String b_user="root";
            String b_senha="";

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(b_db, b_user, b_senha);
            
            stat = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("ERRO: " + e);
        }
        
    }
}
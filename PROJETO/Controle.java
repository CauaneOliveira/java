import java.lang.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


public class Controle extends JFrame {
    
    private final Button btn_login;
    private final Button btn_cadastrar;
    private final Button btn_relatorio;
    private final Label rotuloop;
    private final TextField email;
    private final TextField senha;
    private final Container controle;


    Controle(){

        controle = getContentPane();
        controle.setLayout(null);

        rotuloop = new Label("OPÇÕES");
        controle.add(rotuloop);
        rotuloop.setBounds(5, 190, 80, 20);


        email =  new TextField("EMAIL",4);
        controle.add(email);
        email.setBounds(5, 220, 80, 20);

        senha =  new TextField("SENHA",4);
        controle.add(senha);
        senha.setBounds(5, 242, 150, 20);

        btn_login = new Button("LOGIN");
        controle.add(btn_login);
        btn_login.setBounds(220, 220, 80, 20);

        btn_cadastrar = new Button("CADASTRAR");
        controle.add(btn_cadastrar);
        btn_cadastrar.setBounds(220, 242, 80, 20);

        btn_relatorio = new Button("GERAR RELATÓRIO");
        controle.add(btn_relatorio);
        btn_relatorio.setBounds(5, 300, 80, 20);
        
        
        setSize(700, 500);
        setVisible(true);
        show();

    }
    
    public boolean action(Event evt, Object arg){

        if ("LOGIN".equals(arg)){
            new Controle2();
            dispose();
        
        }
        if ("CADASTRAR".equals(arg)){
            new Cadastrar_Usuario();
            dispose();
        
        }
        return true;
    }

    public static void main(String[] args) {

        Controle close=new Controle();
        //FECHAR O PROGRAMA 
        close.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
}

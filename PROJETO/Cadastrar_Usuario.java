import java.lang.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


public class Cadastrar_Usuario extends JFrame {
    private Panel p1;
    private Button btn1;
    private TextField nome;
    private TextField email;
    private TextField senha;
    private Label rotulocadastrop;


    public Cadastrar_Usuario(){

        setLayout(new BorderLayout());
        p1 = new Panel();


        rotulocadastrop = new Label("Cadastro Paciente");
        p1.add(rotulocadastrop);

    
        nome =  new TextField("NOME",4);
        p1.add(nome);
        email =  new TextField("EMAIL",4);
        p1.add(email);
        senha =  new TextField("SENHA",4);
        p1.add(senha);
        


        add("North",p1);
        btn1 = new Button("Cadastro");
        p1.add(btn1);
        
        
        reshape(100,200,100,200);
        show();

    }
    
    public boolean action(Event evt, Object arg){

        if ("Cadastro".equals(arg)){
            new Controle();
            dispose();
        
        }
        return true;
    }

    public static void main(String[] args) {

        Cadastrar_Usuario close=new Cadastrar_Usuario();
        //FECHAR O PROGRAMA 
        close.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
}

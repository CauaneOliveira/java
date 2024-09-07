public class Imc extends CalculoIMC{
    public Imc(){
        
        String res = "";
        if(imc < 18.5){
            res = "Magreza";
        }
        if(imc >= 18.5 && imc <= 24.9){
            res = "Saudável";
        }
        if(imc >= 25 && imc <= 29.9){
            res = "Sobrepeso";
        }
        if(imc >= 30 && imc <= 34.9){
            res = "Obesidade Grau I";
        }
        if(imc >= 35 && imc <= 39.9){
            res = "Obesidade Grau II";
        }
        if(imc >= 40){
            res = "Obesidade Grau III";
        }
    }
}
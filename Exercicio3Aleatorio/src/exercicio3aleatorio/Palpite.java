package exercicio3aleatorio;

import java.util.Random;

public class Palpite {
    int valor1;
    int valor2;
    int numeroDado;
    
    void sortear(){
        //Gera dois números aleatórios entre 1 e 10
        //Classe especial Random
        Random aleatorio = new Random();
        valor1 = aleatorio.nextInt(10) + 1;
        valor2 = aleatorio.nextInt(10) + 1;
        informarResultado();
    }
    String informarResultado(){
        StringBuilder sb = new StringBuilder();
        
        if((numeroDado == valor1) || 
                (numeroDado == valor2)){
            sb.append("Acertou um dos números \n");
        }else{
            sb.append("Infelizmente não acertou \n");
        }
        sb.append("Gerado 1: ").append(valor1).append("\n");
        sb.append("Gerado 2: ").append(valor2).append("\n");
        return sb.toString();
    }
}

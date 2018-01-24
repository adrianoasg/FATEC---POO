package exercicio3aleatorio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio3Aleatorio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palpite palpite = new Palpite();
        System.out.println("Digite um Palpite: ");
        palpite.numeroDado = Integer.parseInt(sc.nextLine());
        palpite.sortear();
        String resultado = palpite.informarResultado();
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
    
}

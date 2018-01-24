package exemplovetor;

import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        //Alimentar um vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite um valor: ");
            v[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Vetor Alimentado. Dados abaixo");
        //length = tamanho
        for (int i = 0; i < v.length; i++) { 
            System.out.printf("Pos %d = %d \n", i, v[i]);
        }
        //Outra forma de percorrer e mostrar os itens
        for (int item : v) {
            System.out.println(item);   
        }
    }
    
}

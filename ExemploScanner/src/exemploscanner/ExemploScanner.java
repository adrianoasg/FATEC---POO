package exemploscanner;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        int a, b, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor de a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite valor de b: ");
        b = Integer.parseInt(sc.nextLine());
        soma = a +  b;
        //System.out.println("Resultado: " + soma);
        System.out.printf("Resultado:  %d \n", soma);
        
    }
    
}

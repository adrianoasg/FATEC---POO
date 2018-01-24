package projetocomputadores;

import java.util.Scanner;

public class PrincipalComputador {


    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.marca = "HP";
        c1.modelo = "Inspirion";
        c1.cor = "Branca";
        c1.numeroSerie = 1234;
        c1.preco = 5000;
        c1.imprimir();
        c1.calcularValor();
        System.out.println("");
        c1.imprimir();
        
        Computador c2 = new Computador();
        c2.marca = "ibm";
        c2.modelo = "Lenovo";
        c2.cor = "Preta";
        c2.numeroSerie = 4556;
        c2.preco = 2000;
        c2.imprimir();
        c2.calcularValor();
        System.out.println("");
        c2.imprimir();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o novo preco do " + c2.marca);
        double valor = Double.parseDouble(sc.nextLine());
        boolean alterou = c2.alterarValor(valor);
        if(alterou){
            System.out.println("Preço alterado com sucesso");
        }else{
            System.out.println("Valor inválido");
        }
        c2.imprimir();
        
    }
    
}


package projetolivraria3;

import java.util.Scanner;

public class GerenciarEstoque {
public void comprar(Produtos prod){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = Integer.parseInt(sc.nextLine());
        System.out.println("Estoque anterior: " + prod.getEstoqueDisponivel());
        int saldo = quantidade + prod.getEstoqueDisponivel();
        prod.setEstoqueDisponivel(saldo);
        System.out.println("Estoque atual: " + prod.getEstoqueDisponivel());
    }
    public void vender(Produtos prod){
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade vendida");
        int quantidade = Integer.parseInt(sc.nextLine());
        System.out.println("Estoque anterior: " + prod.getEstoqueDisponivel());
        int saldo = prod.getEstoqueDisponivel() - quantidade;
        prod.setEstoqueDisponivel(saldo);
        System.out.println("Estoque atual: " + prod.getEstoqueDisponivel());
    }
    
    public void encomendar(Produtos prod){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada: ");
        int quantidade = Integer.parseInt(sc.nextLine());
        if(quantidade < prod.getEstoqueDisponivel()){
            System.out.println("Encomenda do produto: " + prod.getDescricao() + 
                    " realizada com pronta entrega!");
        } else{
            System.out.println("Encomenda do produto: " + prod.getDescricao() + 
                    " em análise - realizando pedido com fornecedores");
        }
    }
}

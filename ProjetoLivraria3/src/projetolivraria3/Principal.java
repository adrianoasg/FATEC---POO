package projetolivraria3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        //Criando um objeto livro
        Livros livro = new Livros();
        livro.setDescricao("Java com Ênfase em OO");
        livro.setEdicao("N. 1");
        livro.setAutor("Douglas Mendes");
        livro.setEditora("Novatec");
        livro.setGenero("Programação");
        livro.setEstoqueDisponivel(10);
        livro.setPrecoCusto(100.90);
        livro.calcularPrecoVenda();
        
        //Criando um objeto Dvd
        Dvds dvd = new Dvds();
        dvd.setDescricao("Acima de Qualquer Suspeita");
        dvd.setCensura("14 anos");
        dvd.setDiretor("Michael Douglas");
        dvd.setDuracao("120 minutos");
        dvd.setEstoqueDisponivel(5);
        dvd.setGenero("Drama");
        dvd.setPrecoCusto(66.98);
        dvd.calcularPrecoVenda(3.20);
        
        //Criando um objeto cd
        Cds cd = new Cds();
        cd.setDescricao("Live Era '87-'93");
        cd.setGenero("Rock");
        cd.setGravadora("Universal");
        cd.setPaisOrigem("EUA");
        cd.setArtista("Guns N' Roses");
        cd.setEstoqueDisponivel(5);
        cd.setPrecoCusto(9.99);
        cd.calcularPrecoVenda();
        
    //Menu - Escolha uma opção
    int opc = 0;
    while(opc != 4){
        System.out.println("Escolha a opção");
            System.out.println("1--> Operações com Livro");
            System.out.println("2--> Operações com título de DVD ");
            System.out.println("3--> Operações com CD");
            System.out.println("4--> Sair");
            opc = Integer.parseInt(sc.nextLine());
            GerenciarEstoque controle = new GerenciarEstoque(); 
            switch(opc){
                case 1:
                    System.out.println("<---- LIVRO ---->");
                    System.out.println("1) Consultar - 2) Comprar - " +
                            "3) Vender - 4) Reajuste - 5) Encomendar");
                    int operador = Integer.parseInt(sc.nextLine());
                    if(operador == 1) livro.listarProduto();
                    if(operador == 2) controle.comprar(livro);
                    if(operador == 3) controle.vender(livro);
                    if(operador == 4) livro.calcularPrecoVenda();
                    if(operador == 5) controle.encomendar(livro);
                    break;
                case 2: 
                    System.out.println("<---- DVD ---->");
                    System.out.println("1) Consultar - 2) Comprar - " +
                            "3) Vender - 4) Reajuste - 5) Encomendar");
                    int operador2 = Integer.parseInt(sc.nextLine());
                    if(operador2 == 1) dvd.listarProduto();
                    if(operador2 == 2) controle.comprar(dvd);
                    if(operador2 == 3) controle.vender(dvd);
                    if(operador2 == 4) dvd.calcularPrecoVenda();
                    if(operador2 == 5) controle.encomendar(dvd);
                    break;
                case 3:
                    System.out.println("<---- CD ----->");
                    System.out.println("1) Consultar - 2) Comprar - " +
                            "3) Vender - 4) Reajuste - 5) Encomendar");
                    int operador3 = Integer.parseInt(sc.nextLine());
                    if(operador3 == 1) cd.listarProduto();
                    if(operador3 == 2) controle.comprar(cd);
                    if(operador3 == 3) controle.vender(cd);
                    if(operador3 == 4) cd.calcularPrecoVenda();
                    if(operador3 == 5) controle.encomendar(cd);
                    break;
                    
                case 4:
                    break;
            }
        }
            System.out.println();
            System.out.println("Aguarde um momento.....");
            Thread.sleep(2000);
            livro.listarProduto();
            dvd.listarProduto();
            cd.listarProduto();
    }   
}

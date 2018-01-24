
package projetolivraria;

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
    while(opc != 7){
        System.out.println("Escolha a opção");
            System.out.println("1--> Comprar Mais Exemplar do Livro");
            System.out.println("2--> Vender Exemplar do Livro");
            System.out.println("3--> Comprar Mais um Título do DVD ");
            System.out.println("4--> Vender Um Título do DVD");
            System.out.println("5--> Comprar Um CD");
            System.out.println("6--> Vender Um CD");
            System.out.println("7--> Sair");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    System.out.println("Quantidade a comprar do livro...: " + 
                            livro.getDescricao());
                    livro.comprar(Integer.parseInt(sc.nextLine()));
                    break;
                case 2: 
                    System.out.println("Quantidade a vender de livro...: " + 
                            livro.getDescricao());
                    livro.vender(Integer.parseInt(sc.nextLine()));
                    break;
                case 3:
                    System.out.println("Quantidade a Comprar do DVD...: " +
                            dvd.getDescricao());
                    dvd.comprar(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    System.out.println("Quantidade a vender do DVD...: " +
                            dvd.getDescricao());
                    dvd.vender(Integer.parseInt(sc.nextLine()));
                    break;
                case 5: 
                    System.out.println("Quantidade a compar do CD...: " +
                            cd.getDescricao());
                    cd.comprar(Integer.parseInt(sc.nextLine()));
                    break;
                case 6:
                    System.out.println("Quantidade a vender do CD...:" +
                            cd.getDescricao());
                    cd.vender(Integer.parseInt(sc.nextLine()));
                    break;
                case 7:
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

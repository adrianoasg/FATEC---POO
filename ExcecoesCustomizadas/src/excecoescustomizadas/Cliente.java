package excecoescustomizadas;

import java.util.Scanner;

public class Cliente {

    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ClienteException {
        try {
            if(nome.length()>50) throw new ClienteException(17);
        } catch (ClienteException e) {
            throw e;
        }
        this.nome = nome;
    }

    public void cadastrarCliente() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o id do Cliente: ");
            this.id = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o nome do Cliente: ");
            this.setNome(sc.nextLine());
            System.out.println("Cliente cadastrado com sucesso..");
        } catch (Exception e) {
            System.out.println("Aconteceu o erro: " + e.getMessage());
        }

    }

    public void imprimir() {
        System.out.println("Id do cliente: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }
}

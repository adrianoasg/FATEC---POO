package exemploestrutura;

public class Conta {
    int tipo;
    Aluno aluno;
    static int pontos = 10;
    
    //Mostrar os dados da conta do aluno
    void mostrarConta(){
        System.out.println("Dados da Conta...");
        System.out.println("Conta pertencente a: ");
        System.out.println("Aluno: " + this.aluno.nome.toUpperCase());
        System.out.println("Total de Pontos: " + pontos);
    }
}

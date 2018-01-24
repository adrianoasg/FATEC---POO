package exemploestrutura;

public class ExemploEstrutura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        aluno1.ra = 123;
        aluno1.nome = "João da Silva";
        aluno2 = new Aluno();
        aluno2.ra = 234;
        aluno2.nome = "Juca da Silva";
        aluno1.matricular();
        aluno2.matricular();
        Conta conta1, conta2;
        conta1 = new Conta();
        conta2 = new Conta();
        conta1.tipo = 3;
        conta1.aluno = aluno1;
        conta2.tipo = 4;
        conta2.aluno = aluno2;
        //Mostrar as contas
        Conta.pontos = 23;
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        conta1.mostrarConta();
        conta2.mostrarConta();
    }

}

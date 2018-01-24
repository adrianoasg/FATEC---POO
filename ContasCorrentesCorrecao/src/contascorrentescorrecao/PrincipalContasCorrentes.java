package contascorrentescorrecao;

import java.util.Scanner;

public class PrincipalContasCorrentes {

    public final int TAM = 3;
    public int indice = 0;
    public ContasCorrente[] cc = new ContasCorrente[TAM];

    public static void main(String[] args) {
        //Instanciando a classe PrincipalContasCorrentes
        //Faço isso para poder chamar os métodos da classe.
        PrincipalContasCorrentes pcc = new PrincipalContasCorrentes();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            //Menu com do while e switch
            System.out.println("Escolha sua opcao: ");
            System.out.println("1.. Cadastrar ");
            System.out.println("2.. Depositar ");
            System.out.println("3.. Sacar  ");
            System.out.println("4.. Consultar ");
            System.out.println("9.. Sair ");
            System.out.println("Escolha ==> ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    pcc.execCadastro();
                    break;
                case 2:
                    pcc.execDeposito();
                    break;
                case 3:
                    pcc.execSaque();
                    break;
                case 4:
                    pcc.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opc != 9);
    }

    public void execCadastro() {
        Scanner sc = new Scanner(System.in);
        //Efetuar o cadastro se houver espaço no vetor
        if (indice < 3) {
            this.cc[indice] = new ContasCorrente();
            System.out.println("Cadastrando conta");
            System.out.println("Digite conta: ");
            this.cc[indice].conta = Integer.parseInt(sc.nextLine());
            System.out.println("Digite agencia: ");
            this.cc[indice].agencia = Integer.parseInt(sc.nextLine());
            System.out.println("Digite nome: ");
            this.cc[indice].nome = sc.nextLine();
            System.out.println("Conta Cadastrada com sucesso");
            indice++;
        } else {
            //Mensagem se o limite do vetor estiver cheio
            System.out.println("Espaco insuficiente para cadastrar conta");
        }
    }

    public void execConsulta() {
        System.out.println("Exibindo os dados de todas as contas");
        System.out.println("------------------------------------");
        for (ContasCorrente conta : cc) {
            System.out.println("");
            if(cc!=null) conta.imprimir(); //Imprime apenas se houver
        }
    }

    public void execSaque() {
        //Peço a conta e o valor a sacar
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuando saque");
        System.out.println("Digite o numero da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o valor a sacar");
        double valor = Double.parseDouble(sc.nextLine());
        //Percorre todas as contas
        for (ContasCorrente conta : cc) {
            //se tiver instanciado (existir objeto)
            if (conta != null) {
                //Pergunto se é igual ao numero digitado
                if (conta.conta == numConta) {
                    //tento efetuar o saque
                    int ret = conta.sacar(valor);
                    if (ret == 1) {
                        System.out.println("Saque efetuado com sucesso");
                        return;
                    } else {
                        System.out.println("Sem saldo");
                        return;
                    }
                }
            }
        }
        System.out.println("Essa conta não existe");
    }

    public void execDeposito() {
        //Peco a conta e o valor a ser depositado
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuando depostio");
        System.out.println("Digite o numero da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o valor a depositar");
        double valor = Double.parseDouble(sc.nextLine());
        for (ContasCorrente conta : cc) {
            if (conta != null) {
                if (conta.conta == numConta) {
                    conta.depositar(valor);
                    System.out.println("Deposito efetuado com sucesso");
                    return;
                }
            }
        }
        System.out.println("Essa conta não existe");
    }
}

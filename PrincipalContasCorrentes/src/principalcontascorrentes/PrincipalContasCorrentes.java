package principalcontascorrentes;

import java.util.Scanner;

public class PrincipalContasCorrentes {

    //atributos
    public ContasCorrente cc = new ContasCorrente();

    //métodos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        PrincipalContasCorrentes pcc
                = new PrincipalContasCorrentes();
        do {
            System.out.println("Escolha sua opção");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("5.. Sair");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    pcc.execCadastrar();
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
                case 5:
                    System.out.println("Fui. Acabou");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opc != 5);
    }

    void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrando a conta");
        System.out.println("Digite o numero: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o nome");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Conta cadastrada");
    }

    void execConsulta() {
        cc.imprimir();
    }

    void execSaque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        int retorno = cc.sacar(valor);
        if (retorno == 1) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não possui saldo suficiente");
        }
    }

    void execDeposito() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }

}

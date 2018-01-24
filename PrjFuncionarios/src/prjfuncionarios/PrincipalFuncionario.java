package prjfuncionarios;

import java.util.Scanner;

public class PrincipalFuncionario {

    //Atributos

    public final int T = 10;
    public int indice = 0;
    public Funcionario[] func = new Funcionario[T];

    //Métodos
    public void execCadastro() {
        Scanner sc = new Scanner(System.in);
        if ((indice >= 0) && (indice < 10)) {
            //Cadastrar
            this.func[indice] = new Funcionario();
            System.out.println("Digite o nome");
            this.func[indice].setNome(sc.nextLine());
            System.out.println("Digite o RG");
            this.func[indice].setRg(sc.nextLine());
            System.out.println("Digite o salario: ");
            this.func[indice].setSalario(Double.parseDouble(sc.nextLine()));
            System.out.println("Digite Departamento: ");
            this.func[indice].setDepartamento(sc.nextLine());
            this.func[indice].setEstaNaEmpresa(true);
            System.out.println("Cadastrado com sucesso");
            indice++;
        } else {
            System.out.println("Não há espaço no vetor");
        }

    }

    public void execBonificacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonificação de funcionário");
        System.out.println("Digite o RG do Funcionáiro desejado");
        String rgProcurado = sc.nextLine();
        for (Funcionario item : func) {
            if (item != null) {
                if (rgProcurado.equals(item.getRg())) {
                    System.out.println("Digite o valor da bonificação: ");
                    double valor = Double.parseDouble(sc.nextLine());
                    item.bonificar(valor);
                    System.out.println("Bonificado com sucesso");
                    return;
                }
            }
        }
        System.out.println("Funcionário não encontrado");
    }

    public void execConsulta() {
        for (Funcionario item : func) {
            if(item != null){
                System.out.println("=====================");
                item.imprimir();
                System.out.println("=====================");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrincipalFuncionario pf = new PrincipalFuncionario();
        int opc = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Bonificar");
            System.out.println("3.. Consultar");
            System.out.println("4.. Sair");
            System.out.println("Digite sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    pf.execCadastro();
                    break;
                case 2:
                    pf.execBonificacao();
                    break;
                case 3:
                    pf.execConsulta();
                    break;
                case 4:
                    System.out.println("Finalizou");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } while (opc != 4);
    }

}

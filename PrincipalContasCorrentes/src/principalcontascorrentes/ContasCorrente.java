package principalcontascorrentes;

public class ContasCorrente {
    //Atributos
    String conta;
    double saldo;
    String nomeCliente;
    
    //Métodos
    int sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }
    void depositar(double valor){
        saldo += valor;
    }
    void imprimir(){
        System.out.println("Dados da Conta: " + conta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}

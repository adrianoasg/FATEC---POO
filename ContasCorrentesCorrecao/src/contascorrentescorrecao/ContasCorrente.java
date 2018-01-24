package contascorrentescorrecao;

public class ContasCorrente {
    public int conta;
    public int agencia;
    public double saldo;
    public String nome;
    
    public int sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Conta: " + conta);
        System.out.println("Ag: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Nome: " + nome);
        System.out.println("---------------------------");
    }
}

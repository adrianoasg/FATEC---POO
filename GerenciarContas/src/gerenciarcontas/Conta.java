
package gerenciarcontas;


public abstract class Conta {
    private int numConta;
    private String nomeCliente;
    protected double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos da classe conta
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }
    
    public boolean sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            calcularImposto(valor * 0.01);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("\nNúmero da Conta: ").append(numConta);
        texto.append("\nNome Cliente: ").append(nomeCliente);
        texto.append("\nSaldo em R$: ").append(saldo);
        return texto.toString();
    }
    
    protected abstract void calcularImposto(double valor);
}

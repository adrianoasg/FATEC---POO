
package gerenciarcontas;


public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor){
        if(valor <= (limite + saldo)){
            saldo-= valor;
            calcularImposto(valor * 0.02);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append(super.toString());
        texto.append("\nLimite: ").append(limite);
        return texto.toString();
    }

    @Override
    protected void calcularImposto(double valor) {
        saldo -= valor;
    }

    

    

    
}

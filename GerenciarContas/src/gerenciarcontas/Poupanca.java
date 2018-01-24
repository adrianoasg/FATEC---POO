package gerenciarcontas;


public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append(super.toString());
        texto.append("\nDia Aniversário: ").append(diaAniversario);
        return texto.toString();
    }

    @Override
    protected void calcularImposto(double valor) {
        saldo -= valor;
    }

   

    
}

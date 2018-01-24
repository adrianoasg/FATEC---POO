package gerenciarcontagui;


public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    
    public String depositar(double valor){
        if(valor < 0){
            return "Valor inválido";
        }
        saldo += valor;
        return "Depósito efetuado com sucesso";
    }
    
    public String sacar(double valor) throws SemSaldoException {
        try {
            if(valor<=saldo){
            saldo-= valor;
            return "Saque efetuado com sucesso";
        }
        throw new SemSaldoException();
        } catch (SemSaldoException e) {
            throw e;
        }
        
        
        
    }
    
}

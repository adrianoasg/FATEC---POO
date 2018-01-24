package gerenciarcontas;


public class GerenciarPatrimonio {
    private double totalPatrimonio;

    public double getTotalPatrimonio() {
        return totalPatrimonio;
    }
    
    public void adicionarConta(Conta obj){
        //A ideia é somar ao patrimonio, o saldo da conta
        this.totalPatrimonio += obj.saldo;
    }
    
}

package gerenciarcontas;

public class GerenciarContas {


    public static void main(String[] args) {
        
        Corrente c1 = new Corrente();
        c1.setNumConta(111);
        c1.setNomeCliente("Maria");
        c1.setLimite(2000.0);
        
        boolean depositou = c1.depositar(2000);
        if(depositou){
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido para depósito");
        }
        System.out.println("Saldo atual: " + c1.getSaldo());
        
        boolean sacou = c1.sacar(1000);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + c1.getSaldo());
        
        Poupanca p = new Poupanca();
        p.setNumConta(222);
        p.setNomeCliente("Jose");
        p.setDiaAniversario(23);
        depositou = p.depositar(1000);
        if(depositou){
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido");
        }
        sacou = p.sacar(500);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual da poup: " + p.getSaldo());
        System.out.println(p.toString());
        System.out.println(c1.toString());
        
        ////Gerenciar o patrimonio do Banco
        GerenciarPatrimonio gp = new GerenciarPatrimonio();
        gp.adicionarConta(c1);
        gp.adicionarConta(p);
        System.out.println("Saldo de Todas as Contas: ");
        System.out.println(gp.getTotalPatrimonio());
    }
    
}

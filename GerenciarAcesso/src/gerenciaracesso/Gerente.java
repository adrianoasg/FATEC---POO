package gerenciaracesso;

public class Gerente extends Funcionario implements Logavel {

    @Override
    public void efetuarLogin() {
        System.out.println("Gerente Logou...");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Gerente saiu do sistema...");
        GerenciarAcesso.removerLogado(this);
    }
    
}

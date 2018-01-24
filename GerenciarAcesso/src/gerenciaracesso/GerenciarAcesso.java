package gerenciaracesso;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {

    private static int total = 0;
    private static List<Logavel> lista = new ArrayList<>();
    
    public static void adicionarLogado(Logavel o){
        lista.add(o);
        total++;
    }
    public static void removerLogado(Logavel o){
        lista.remove(o);
        total--;
    }
    public static List<Logavel> exibirLogados(){
        return lista;
    }
    public static int getTotal(){
        return total;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        cli1.efetuarLogin();
        cli1.efetuarLogout();
        cli2.efetuarLogin();
        Fornecedor for1 = new Fornecedor();
        for1.efetuarLogin();
        System.out.println("Total do logados: " + total);
        //Mostrar quem está logado no momento
        for (Logavel item : GerenciarAcesso.exibirLogados()) {
            System.out.println("Objeto Logado: " + item.getClass());
            System.out.println("...................................");
        }
    }
    
}

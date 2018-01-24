package exemploatributo;

import java.util.LinkedList;
import java.util.List;

public class ExemploAtributo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exemplo de variável local
        int qtd = 15;
        //Exemplo de variável objeto (referência)
        Aluno a1 = new Aluno();
        a1.ra = 111;
        a1.nome = "Mariana";
        a1.mostrarDados();
        Aluno a2 = new Aluno();
        a2.ra = 222;
        a2.nome = "Maycon";
        a2.mostrarDados();
        
    }
    
}

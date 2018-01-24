/*
 * Aulas professor Maromo.
 */
package projetoacampamento2408;

import java.util.Scanner;

/**
 *
 * @author maromo
 */
public class PrincipalAcampamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do membro do acampamento: ");
        membro.nome = sc.nextLine();
        System.out.println("Digite a idade do " + membro.nome);
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        System.out.println("-----------------");
        membro.imprimir();
        
        
    }
    
}

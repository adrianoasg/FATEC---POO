/*
 * Aulas professor Maromo.
 */
package exemploestrutura;

/**
 *
 * @author maromo
 */
public class Aluno {
    //Definir atributos
    int ra;
    String nome;
    
    //Método para matricula
    void matricular(){
        System.out.println("Aluno Matriculado");
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("----------------------------");
    }
    //Método construtor
    //public Aluno(){
    //    System.out.println("Construindo um obj. Aluno");
   // }
}

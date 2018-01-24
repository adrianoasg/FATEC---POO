/*
 * Aulas professor Maromo.
 */
package helloclass;

/**
 *
 * @author maromo
 */
public class Aluno {
    //Atributos
    public int idade;
    public String nome;
    
    //Métodos
    public void matricular(){
        //Funcionalidade de matricula
        System.out.println("Matriculando...");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
}

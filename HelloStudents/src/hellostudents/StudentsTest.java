/*
 * Aulas professor Maromo.
 */
package hellostudents;

import java.util.Scanner;

/**
 *
 * @author maromo
 */
public class StudentsTest {

    /**
     * @param args Parâmetro que pode ser passado pela linha de 
     * comando
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa que recebe dois dados do usuario
        //um refere-se ao nome e o outro refere-se a idade
        //1. Criar um objeto do tipo Student (variável objeto)
        Student aluno = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.println("Digite a idade: ");
        aluno.age = sc.nextInt();
        aluno.show();
        
        
    }
    
}

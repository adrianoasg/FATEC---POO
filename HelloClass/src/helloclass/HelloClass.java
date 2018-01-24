package helloclass;

public class HelloClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola sala do 2 GTI");
        Aluno aluno1, aluno2;
        aluno1 = new Aluno(); //Construção
        aluno1.nome = "Zeca";
        aluno1.idade = 35;
        aluno1.matricular();
        aluno2 = new Aluno();
        aluno2.matricular();
        
    }
    
}

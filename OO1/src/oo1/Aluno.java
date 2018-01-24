package oo1;


public class Aluno {
    //Definir os atributos
    public int ra;
    public String nome;
    public String endereco;
    public String dataNascimento;
    
    //Definir os métodos
    public String matricular(){
        StringBuilder texto = new StringBuilder();
        texto.append("Efetuando a Matrícula \n");
        texto.append("Ra do Aluno: ").append(ra).append("\n");
        texto.append("Nome do Aluno: ").append(nome).append("\n");
        texto.append("Matrícula efetuada com sucesso \n");
        return texto.toString();
    }
    
    public boolean cancelarMatricula(int raProc){
        if(raProc == ra){
           return true;
        }
        return false;
    }
}

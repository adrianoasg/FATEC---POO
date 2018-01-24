package projetoacampamento2408;


public class Acampamento {
    //Atributos
    String nome;
    char equipe;
    int idade;
    
    //Métodos
    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Equipe: " + equipe);
        System.out.println("Idade do Membro: " + idade);
    }
    void separarGrupo(){
        if(idade<6){
            equipe = ' ';
            return;
        }
        if(idade<11){
            equipe = 'A';
            return;
        }
        if(idade<21){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}

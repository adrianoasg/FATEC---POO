package exemplovetor2;

import java.util.Scanner;

public class ExemploVetor2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma[] vetTurma = new Turma[3];
        for (int i = 0; i < vetTurma.length; i++) {
            Turma turma = new Turma();
            turma.getClass();
            System.out.println("Digite a sala: ");
            turma.sala = Integer.parseInt(sc.nextLine());
            System.out.println("Digite a descrição: ");
            turma.descricao = sc.nextLine();
            vetTurma[i] = turma;
        }
        Object x = new Object();
        
        
        //vetTurma[2] = vetTurma[0];
        for (Turma turma : vetTurma) {
            turma.imprimir();
            System.out.println("");
        }
    }
    
}

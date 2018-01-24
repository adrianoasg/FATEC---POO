package exemplohash;


public class ExemploHash {


    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.ra = 1;
        a1.nome = "Ana";
        System.out.println("Hash de Ana: " + a1.hashCode());
        Aluno a2 = new Aluno();
        a2.ra = 2;
        a2.nome = "Ana";
        System.out.println("Hash de Ana: " + a2.hashCode());
        System.out.println(a1.equals(a2));
    }
    
}

package exemplohash;

import java.util.Objects;


public class Aluno {
    public int ra;
    public String nome;

    @Override
    public int hashCode() {
        //Determinado pelo número de letras no nome do aluno
        int hash = nome.length();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.ra != other.ra) {
            return false;
        }
        return true;
    }
    
    
}

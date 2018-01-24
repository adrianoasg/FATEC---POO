package listagenerica;

import java.util.Objects;

public class Produto {
    public int idProduto;
    public String nomeProduto;
    public double valor;
    public int quantidade;

    @Override
    public int hashCode() {
        int hash = nomeProduto.length();
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }
    
    
}

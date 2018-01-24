
package projetolivraria3;

public abstract class Produtos {
    //Membros com acesso (private)
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
      private double precoVenda;
      
    //Métodos Modificadores de Acesso aos Campos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
    //Métodos Construtores sem parâmetros
    public Produtos(){
        this.descricao = "";
        this.estoqueDisponivel = 0;
        this.genero = "";
        this.precoCusto = 0.0;
        this.precoVenda = 0.0;
    }
    
    //Métodos Abstratos
    public abstract void listarProduto();
    
    public abstract void calcularPrecoVenda();
}

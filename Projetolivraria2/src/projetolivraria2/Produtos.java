
package projetolivraria2;
//SuperClasse Abstrata
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
    
    //Métodos Especificos da Classe
    
    public void comprar(int qtd){
        //Apressenta o estoque atual. E o estoqueatualizado.
        System.out.println("<----ESTOQUE---->");
        System.out.println("Quantidade do produto: " + this.descricao);
        System.out.println("Anterior: " + this.estoqueDisponivel);
        this.estoqueDisponivel += qtd;
        System.out.println("Atual:   " + this.estoqueDisponivel);
    }
    
    public void vender(int qtd){
        //Apressenta o estoque atual. E o estoqueatualizado.
        System.out.println("<----ESTOQUE---->");
        System.out.println("Quantidade do produto: " + this.descricao);
        System.out.println("Anterior: " + this.estoqueDisponivel);
        this.estoqueDisponivel -= qtd;
        System.out.println("Atual:   " + this.estoqueDisponivel);
        
    }
    
    //Métodos Abstratos
    public abstract void listarProduto();
    
    public abstract void calcularPrecoVenda();
}

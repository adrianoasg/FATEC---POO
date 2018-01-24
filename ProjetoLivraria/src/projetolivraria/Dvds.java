
package projetolivraria;

public class Dvds extends Produtos{
    //Membros ou atributos (privados)
    private String diretor;
    private String duracao;
    private String censura;
 //   private double precoVenda;
    
    //Construtores
    public Dvds(){
        this.diretor = "";
        this.duracao = "";
        this.censura = "";
    }
    
    //Métodos Modificadores de Acesso aos Campos
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
    
    public void listarProduto(){
        System.out.println("<---- DADOS DO PRODUTO ---->");
        System.out.println("Descrição........: " + this.getDescricao());
        System.out.println("Gênero...........: " + this.getGenero());
        System.out.println("Estoque..........: " + this.getEstoqueDisponivel());
        System.out.println("Preço..........R$: " + this.getPrecoCusto());
        System.out.println("Diretor..........: " + this.diretor);
        System.out.println("Preco de Venda R$: " + this.getPrecoVenda());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
    }
    
    public void calcularPrecoVenda(double cotDolar){
        this.setPrecoVenda(this.getPrecoCusto()*cotDolar*1.20);
    }
}

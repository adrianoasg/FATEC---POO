
package projetolivraria;

public class Cds extends Produtos {
    //Membros ou atributos (privados)
    private String artista;
    private String gravadora;
    private String paisOrigem;
  //  private double precoVenda;
    
    //Construtores
    public Cds(){
        this.artista = "";
        this.gravadora = "";
        this.paisOrigem = "";
    }
    
    //Métodos Modificadores de Acesso aos Campos

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void listarProduto(){
        System.out.println("<---- DADOS DO PRODUTO ---->");
        System.out.println("Descrição........: " + this.getDescricao());
        System.out.println("Gênero...........: " + this.getGenero());
        System.out.println("Estoque..........: " + this.getEstoqueDisponivel());
        System.out.println("Preço..........R$: " + this.getPrecoCusto());
        System.out.println("Artista..........: " + this.artista);
        System.out.println("Preco de Venda R$: " + this.getPrecoVenda());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
    }
    
    @Override
    public void calcularPrecoVenda(){
        this.setPrecoVenda(this.getPrecoCusto()*1.15);
    }
}

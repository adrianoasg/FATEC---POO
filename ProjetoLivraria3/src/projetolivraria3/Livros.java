
package projetolivraria3;

public class Livros extends Produtos {
    //Membros ou atributos (privados)
    private String autor;
    private String editora;
    private String edicao;
    
    //Construtor
    public Livros(){
        this.autor = "";
        this.editora = "";
        this.edicao = "";
    }
    
    //Métodos Modificadores de Acesso aos Campos            
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    //Método específico da classe.
    @Override
    public void listarProduto(){
        System.out.println("<---- DADOS DO PRODUTO ---->");
        System.out.println("Descrição........: " + this.getDescricao());
        System.out.println("Gênero...........: " + this.getGenero());
        System.out.println("Estoque..........: " + this.getEstoqueDisponivel());
        System.out.println("Preço..........R$: " + this.getPrecoCusto());
        System.out.println("Autor............: " + this.autor);
        System.out.println("Preco de Venda R$: " + this.getPrecoVenda());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        
    }
    
    @Override
    public void calcularPrecoVenda(){
        this.setPrecoVenda(this.getPrecoCusto()*1.10);
    }
    
}

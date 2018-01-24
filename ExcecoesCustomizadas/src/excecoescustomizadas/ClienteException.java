package excecoescustomizadas;


public class ClienteException extends Exception {
    private int codigo;
    private String mensagem;
    
    public ClienteException(int codigo){
        this.codigo = codigo;
        tratarExcecao();
    }

    private void tratarExcecao() {
        if(codigo == 17){
            mensagem = "Tamanho do campo nome deve ser menor ou igual a 50";
        }
    }
    @Override
    public String getMessage(){
        return mensagem;
    }
}

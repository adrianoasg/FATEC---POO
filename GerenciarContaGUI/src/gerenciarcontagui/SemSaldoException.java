package gerenciarcontagui;

//Ideia é criar um Classe para tratamento de exceções
//Apenas controlar o saque sem saldo.

public class SemSaldoException extends Exception {

    @Override
    public String getMessage(){
        //Gravar um log no banco de dados
        //com a toda a informação do erro
        return "Sem saldo suficiente";
    }
}

package projetocomputadores;

public class Computador {
    //1. Definir os atributos, conforme Diagrama
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;
    
    //2. Definir os métodos vazios
    void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Num. de Série: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.5;
        }
    }
    boolean alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return true;
        }
        return false;
    }
}

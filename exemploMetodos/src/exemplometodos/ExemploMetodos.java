package exemplometodos;

import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {

    public static void main(String[] args) {
        List lista = new ArrayList();
        //Lista de qualquer coisa
        lista.add(12);
        lista.add("Juca");
        lista.add(30);
        lista.add(System.currentTimeMillis());
        lista.add(new Integer(23));
        lista.add("Juca");
        lista.add("Maromo");
        //Qtos elementos tem na lista
        System.out.println(lista.size());
        for (Object item : lista) {
            System.out.println("Elemento: " + item);
        }
        while(lista.contains("Juca")){
            lista.remove("Juca");
        }
        for (Object item : lista) {
            System.out.println("Elemento: " + item);
        }
        System.out.println(lista.size());
        lista.clear();
        System.out.println("Tamanho depois do clear: " + lista.size());
    }
    
}

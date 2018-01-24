/*
 * Aulas professor Maromo.
 */
package exemplopacotecarros;

import exemplopacoteroda.Roda;

/**
 *
 * @author maromo
 */
public class ExemploPacoteCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c = new Carro();
     /*   Roda r1 = new Roda();
        Roda r2 = new Roda();
        Roda r3 = new Roda();
        Roda r4 = new Roda(); */
        
        c.chassi= 123;
        c.rodas[0] = new Roda();
        c.rodas[1] = new Roda(); 
        c.rodas[2] = new Roda();
        c.rodas[3] = new Roda();
        c.rodas[0].descricaoRoda = "Roda do lado direito frontal";
    }
    
}

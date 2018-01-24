package exemplovetor3;

import java.util.Arrays;

public class ExemploVetor3 {


    public static void main(String[] args) {
        int va [] = {3,5,7,9,12};
       /* for (int item : va) {
            System.out.println(item);
        }*/
        int vb [] = new int[15];
     
        Arrays.fill(vb, 3, 8, 25);
        for (int item : vb) {
            System.out.println(item);
        }
        
    }
    
}

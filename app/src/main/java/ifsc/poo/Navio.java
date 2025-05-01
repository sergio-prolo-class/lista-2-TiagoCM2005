package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Navio {
    
    private final int CASA = 40;
    private final int PIXEL = 50;
    
    public void desenhar(Draw navio){

         for(int i = 130; i <= 290; i+=40){
        navio.filledSquare(170, i, 19.4);
        }

        for(int i = 90; i <=130; i+=40){
            navio.filledSquare(i, 370, 19.4);
        }
 
    }
    public void navio(String orientacao, char simbolo, Double[][] xy ){
        
        
    }
}

package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    
    public void desenhar(Draw grade){
        
        for(int j = 50; j < 450;j+=40){
            for(int i = 50; i < 450; i+=40){
                grade.square(i, j, 20);
            }
        }


        grade.text(30, 30, "A");
    }
}

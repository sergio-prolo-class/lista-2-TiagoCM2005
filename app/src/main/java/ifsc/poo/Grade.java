package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    
    public void desenhar(Draw grade){
        
        for(int j = 50; j < 450;j+=40){
            for(int i = 50; i < 450; i+=40){
                grade.square(i, j, 20);
            }
        }

        grade.setPenColor(255,0,0);
        char num = '0';
        for(int i = 50; i < 450; i+=40){
            grade.text(i, 10, num + "");
            num++;
        }

        char letra = 'A';
        for(int j = 50; j < 450; j+=40){
            grade.text(10, j, letra + "");
            letra++;
        }
    }
}

package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {

    private final int x;
    private final int y;
    private final int celula = 40;
    private final int linhas = 10;
    private final int colunas = 10;

    public Grade(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desenhar(Draw grade){

        grade.setPenColor(0,0,0);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                double centrox = x + j*celula + celula/2.0;
                double centroy = y + i*celula + celula/2.0;
                grade.square(centrox, centroy, celula/2.0);
            }
    }

    grade.setPenColor(255,0,0);
    for(int i = 0; i < colunas; i++){
        char letra = (char) ('A' + i);
        double centroy = y + i*celula + celula/2.0;
        grade.text(x - 15, centroy, String.valueOf(letra));
    }

    for(int i = 0; i < linhas; i++){
        String num = String.valueOf(i);
        double centrox = x + i*celula + celula/2.0;
        grade.text(centrox, y - 15, num);
    }
}
    // Criado getters para a classe Navio.
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getCelula(){
        return celula;
    }

}

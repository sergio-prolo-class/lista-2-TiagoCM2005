package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class App {
    private final int LARGURA = 1000;
    private final int ALTURA = 600;
    Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.draw.setCanvasSize(LARGURA, ALTURA);
        this.draw.setXscale(0, LARGURA);
        this.draw.setYscale(0, ALTURA);
        // =================== Grade ====================
        Grade gradeJogador = new Grade(50, 50);
        gradeJogador.desenhar(draw);

        // ========== Navios do jogador ============
        Navio[] navios = new Navio[] {
            new Navio(gradeJogador, 4, 0, 0, false),   
            new Navio(gradeJogador, 3, 5, 1, true),  
            new Navio(gradeJogador, 5, 3, 2, true),  
            new Navio(gradeJogador, 3, 7, 5, true),  
            new Navio(gradeJogador, 2, 1, 8, false)   
        };

        // ============ Desenha todos ============
        for (int i = 0; i < navios.length; i++) {
            Navio n = navios[i];
            n.desenhar(draw);
        }
    }


    public static void main(String[] args) {
        App app = new App();
        app.draw.show();
        
    }
}




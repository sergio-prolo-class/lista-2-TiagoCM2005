package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class App {
    private final int LARGURA = 1000;
    private final int ALTURA = 600;
    Draw draw;

    public App(){
        // Etapa 1, criação da tela
        
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.draw.setCanvasSize(LARGURA, ALTURA);
        this.draw.setXscale(0, LARGURA);
        this.draw.setYscale(0, ALTURA);
        // =================== Grade ====================
        Grade gradeJogador = new Grade(50, 50);
        gradeJogador.desenhar(draw);

        Grade gradeAlvo = new Grade(550, 50);
        gradeAlvo.desenhar(draw);

        // ========== Navios do jogador ============
        // Criado um vetor para todos os navios do jogador
        // Caso quando for criar o navio e querer usar apenas números, lembrar que o número 0 é a letra A, 1 é B, 2 é C e assim por diante.
        // Exemplo: Navio(gradeJogador, 4, 0, 'A', false) -> Navio(gradeJogador, 4, 0, 0, false)
        Navio[] navios = new Navio[] {
            new Navio(gradeJogador, 4, 0, 'A', false),   
            new Navio(gradeJogador, 3, 5, 'B', true),  
            new Navio(gradeJogador, 5, 3, 'C', true),  
            new Navio(gradeJogador, 3, 7, 'F', true),  
            new Navio(gradeJogador, 2, 1, 'I', false)   
        };

        // ============ Desenha todos ============
        // FOR para imprimir todos os navios
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




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

        grade.setPenColor(0,0,0); // Pintar o pincel de preto

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                double centrox = x + j*celula + celula/2.0; // Na primeira linha, imprimi todos os quadrados da coluna 0, depois todos os quadrados da coluna 1 e assim por diante.
                double centroy = y + i*celula + celula/2.0;
                grade.square(centrox, centroy, celula/2.0); // Usado um quadrado vazio para desenhar a grade
            }
    }

    grade.setPenColor(255,0,0); // Pintar o pincel de vermelho
    for(int i = 0; i < linhas; i++){ // Como a legenda das linhas é a letra, o for vai de 0 a 9, ou seja, 10 linhas. 
        char letra = (char) ('A' + i); // Usado a lógica de 'A' + i, onde o i vai de 0 a 9, ou seja, A, B, C, D, E, F, G, H, I e J.
        double centroy = y + i*celula + celula/2.0; // Obter o valor da linha 
        grade.text(x - 15, centroy, String.valueOf(letra)); // Usando o x - 15 para imprimir a letra na linha
    }

    // Mesma lógica do for de cima, mas agora para as colunas, imprimir os números de 0 a 9.

    for(int i = 0; i < colunas; i++){
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

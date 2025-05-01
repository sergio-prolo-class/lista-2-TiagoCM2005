package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Navio {
    
    private final int tamanho;
    private final int coluna;
    private final int linha;
    private final boolean vertical;
    private final Grade grade;

    public Navio(Grade grade, int tamanho, int coluna, int linha, boolean vertical) {
        
        int teste_coluna = coluna;
        int teste_linha = linha;
        boolean erro = false;

        if(teste_coluna < 0 || teste_coluna > 10 || teste_linha < 0 || teste_linha > 10){
            System.out.println("Posição fora da grade: coluna ou linha fora de 1-10");
            erro = true;
        }

        if(tamanho < 1 || tamanho > 10){
            System.out.println("Tamanho inválido!");
            erro = true;
        }

        if(vertical && (teste_coluna + tamanho > 10)){
            System.out.println("Navio ultrapassa o limite da grade em x");
            erro = true;
        }

        if(!vertical && (teste_linha + tamanho > 10)){
            System.out.println("Navio ultrapassa o limite da grade em y");
            erro = true;
        }
        
        if(erro){
            System.exit(1);
        }

        this.grade = grade;
        this.tamanho = tamanho;
        this.coluna = teste_coluna;
        this.linha = teste_linha;
        this.vertical = vertical;
    }
        

    public void desenhar(Draw navio){
        for(int i = 0; i < tamanho; i++){
            int c = coluna;
            int l = linha;
            if(vertical) { // Verifica se é vertical
                l+= i; // Se sim, avançar sempre na coodernada y
            } else c+= i; // Caso seja horizontal, avançar a coodernada x

            double centrox = grade.getX() + c*grade.getCelula() + grade.getCelula()/2.0;
            double centroy = grade.getY() + l*grade.getCelula() + grade.getCelula()/2.0;

            navio.filledSquare(centrox, centroy, grade.getCelula() / 2.0 - 0.6);
        }
    }
}


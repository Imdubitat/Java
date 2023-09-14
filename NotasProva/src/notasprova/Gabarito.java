package notasprova;

/**
 * @author rodrigo
 */
public class Gabarito {
    private int numeroQuestao;
    private char[] respostasCorretas;
    
    public Gabarito(char[] respostasCorretas){
        this.respostasCorretas = respostasCorretas;
    }
    
    public char respostaQuestao(int numeroQuestao){
        if (numeroQuestao >= 1 && numeroQuestao <= respostasCorretas.length) {
            return respostasCorretas[numeroQuestao - 1];
        }
        return 0;
    }
}

package notasprova;

public class Prova {
    private Gabarito gabarito;
    private char[] respostasAluno;
    private int questaoAtual;

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
        this.respostasAluno = new char[15];
        this.questaoAtual = 0;
    }

    public void respostaAluno(char resposta) {
        if (questaoAtual < 15) {
            respostasAluno[questaoAtual] = resposta;
            questaoAtual++;
        }
    }

    public int acertos() {
        int acertos = 0;
        for (int i = 0; i < 15; i++) {
            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
                acertos += 1;
            }
        }
        return acertos;
    }

    public double nota() {
        double pontos = 0; // Use um double para manter a precisão
        for (int i = 0; i < 15; i++) {
            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
                if (i < 10) {
                    pontos += 0.5;
                } else {
                    pontos += 1;
                }
            }
        }
    return pontos;
    }
    
    public void maior(Prova p1, Prova p2){
        if(p1.nota() > p2.nota()){
            System.out.println("A nota do aluno 1 é maior que a do aluno 2");
        }else if(p1.nota() < p2.nota()){
            System.out.println("A nota do aluno 2 é maior que a do aluno 1");
        }else if(p1.nota() == p2.nota()){
            System.out.println("notas iguais");
        }
    }
}

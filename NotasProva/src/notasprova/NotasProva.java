package notasprova;

/**
 * @author rodrigo
 */
public class NotasProva {

    public static void main(String[] args) {
        char[] gabaritoRespostas = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        Gabarito g1 = new Gabarito(gabaritoRespostas);

        Prova p1 = new Prova(g1);
        

        // Aluno 1 responde as questões
        p1.respostaAluno('A');
        p1.respostaAluno('B');
        p1.respostaAluno('C');
        p1.respostaAluno('D');
        p1.respostaAluno('E');
        p1.respostaAluno('A');
        p1.respostaAluno('B');
        p1.respostaAluno('C');
        p1.respostaAluno('D');
        p1.respostaAluno('E');
        p1.respostaAluno('A');
        p1.respostaAluno('B');
        p1.respostaAluno('C');
        p1.respostaAluno('D');
        p1.respostaAluno('E');

        System.out.println("Acertos prova1: " + p1.acertos());
        System.out.println("Nota prova1: " + p1.nota());
        
        
        Prova p2 = new Prova(g1);
        
        // Aluno 1 responde as questões
        p2.respostaAluno('A');
        p2.respostaAluno('B');
        p2.respostaAluno('C');
        p2.respostaAluno('D');
        p2.respostaAluno('E');
        p2.respostaAluno('A');
        p2.respostaAluno('B');
        p2.respostaAluno('C');
        p2.respostaAluno('D');
        p2.respostaAluno('E');
        p2.respostaAluno('A');
        p2.respostaAluno('B');
        p2.respostaAluno('C');
        p2.respostaAluno('D');
        p2.respostaAluno('E');

        System.out.println("Acertos prova1: " + p2.acertos());
        System.out.println("Nota prova1: " + p2.nota());
        p1.maior(p1, p2);
    }   
}
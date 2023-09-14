
package mediaaluno;

/**
 * @author rodrigo
 */
public class MediaAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rodrigo", 01, 10, 10, 5);
        System.out.println("nome: " + a1.getNome() + "\nmedia: " + a1.calcularMedia());
        System.out.println("Pontos necessários na prova final: " + a1.calcularFinal());
    }
    
}

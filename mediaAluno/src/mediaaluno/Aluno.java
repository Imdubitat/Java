
package mediaaluno;

/**
 *
 * @author rodrigo
 */
public class Aluno {
    private String nome;
    private int matricula;
    private double prova1;
    private double prova2;
    private double trabalho;

    public Aluno(String nome, int matricula, double prova1, double prova2, double trabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
    
    public double calcularMedia(){
        double mediaCalculada = (this.prova1*0.25)+(this.prova2*0.25)+(this.trabalho*0.5);
        return mediaCalculada;
    }
    
    public double calcularFinal(){
        double mediaFinal=calcularMedia();
       if(mediaFinal<6){
           System.out.println("O aluno precisa de " + (6-mediaFinal) + "pontos"); ;
           return 6-mediaFinal;
       }else{
           System.out.println("Aluno está aprovado e não precisa da prova final");
           return 0;
       }
    }
}

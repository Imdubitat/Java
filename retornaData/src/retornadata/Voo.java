package retornadata;

/**
 * @author rodrigo
 */
public class Voo {
    private int numeroVoo;
    private Data dataVoo;
    private int cadeira;
    private boolean[] ocupacao;
    
    //construtor
    public Voo(int numeroVoo, Data dataVoo, int cadeira) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo.clone();
        this.cadeira = cadeira;
        ocupacao = new boolean[100];
    }

    //retorna o número do voo
    public int getNumeroVoo() {
        return numeroVoo;
    }

    //retorna a data do voo
    public Data getDataVoo() {
        return dataVoo;
    }
    
    //retorna o número da cadeira
    public int getCadeira(){
        return cadeira;
    }
    
    //verifica se a cadeira está ocupada ou se é válida
    public void verifica(int cadeira){
        if(cadeira>=1 || cadeira<=100){
            if(!ocupacao[cadeira - 1]){
                System.out.println("cadeira liberada");
            }else{
                System.out.println("cadeira ocupada");
            }
        }else if(cadeira<1 || cadeira>100){
            System.out.println("cadeira inválida");
        }
    }
    
    //ocupa a cadeira
    public void ocupa(int cadeira){
        if (cadeira < 1 || cadeira > 100) {
            // Cadeira fora do intervalo válido
            System.out.println("Número de cadeira inválido.");
            return;
        }

        if (!ocupacao[cadeira - 1]) {
            ocupacao[cadeira - 1] = true; // Subtrai 1 para ajustar para índices de array
            System.out.println("Cadeira " + cadeira + " ocupada com sucesso.");
        } else {
            System.out.println("Cadeira " + cadeira + " já está ocupada.");
        }
    }
    
    //retorna a quantidade de vagas restantes
    public int Vagas() {
        int vagas = 0;
        for (int i = 0; i < ocupacao.length; i++) {
            if (!ocupacao[i]) {
                vagas++;
            }
        }
        return vagas;
    }
    
    
    //faz o clone da data do voo
    @Override
    public Voo clone() {
        return new Voo(this.numeroVoo, this.dataVoo, this.cadeira);
    }
}

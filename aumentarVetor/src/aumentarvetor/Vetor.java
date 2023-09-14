package aumentarvetor;

/**
 * @author rodrigo
 */
public class Vetor {
    private String[] vetor;
    private int tamanho;

    public Vetor(int tamanhoInicial) {
        vetor = new String[tamanhoInicial];
        tamanho = 0;
    }

    public void insert(String novoElemento) {
        if (tamanho == vetor.length) {
            // Redimensiona o vetor se estiver cheio
            redimensionar();
        }
        vetor[tamanho] = novoElemento;
        tamanho++;
    }

    public String get(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return vetor[posicao];
        }
        return null;
    }

    public int size() {
        return tamanho;
    }

    private void redimensionar() {
        // Cria um novo vetor com o dobro do tamanho
        int novoTamanho = vetor.length * 2;
        String[] novoVetor = new String[novoTamanho];

        // Copia os vetor do vetor original para o novo vetor
        for (int i = 0; i < tamanho; i++) {
            novoVetor[i] = vetor[i];
        }

        // Atualiza a referência para o novo vetor
        vetor = novoVetor;
    }
}
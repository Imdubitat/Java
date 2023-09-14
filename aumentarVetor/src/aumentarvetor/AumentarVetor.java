package aumentarvetor;

/**
 *
 * @author rodrigo
 */
public class AumentarVetor {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(5);
        
        v1.insert("A");
        v1.insert("B");
        v1.insert("C");
        v1.insert("D");
        v1.insert("E");
        v1.insert("F");
        v1.insert("G");
        v1.insert("H");
        
        System.out.println("Tamanho do vetor: " + v1.size());

        System.out.println("Elemento na posição 0: " + v1.get(0));
        System.out.println("Elemento na posição 1: " + v1.get(1));
        System.out.println("Elemento na posição 2: " + v1.get(2));
        System.out.println("Elemento na posição 3: " + v1.get(3)); 
        
    }
    
}
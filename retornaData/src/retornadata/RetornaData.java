package retornadata;

/**
 * @author rodrigo
 */

public class RetornaData {
    public static void main(String[] args) {
        Data d1 = new Data(30, 2, 2021);
        //Voo v1 = new Voo(1, d1, 10);
        
        System.out.println("Data: " + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAno());
        System.out.println("Mes: " + d1.getMesExtenso());
        d1.compara();
       
        
        
        //Data dataVoo = v1.getDataVoo();
        //System.out.println("Data do Voo: " + dataVoo.getDia() + "/" + dataVoo.getMes() + "/" + dataVoo.getAno());
        //System.out.println("Numero do voo: " + v1.getNumeroVoo());
        //System.out.println("Cadeira: " + v1.getCadeira());
        //v1.verifica(10);
        //v1.ocupa(10);
        //v1.verifica(10);
        //System.out.println("Número de cadeiras vagas restantes: " + v1.Vagas());
        
    }
}

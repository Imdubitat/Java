package retornadata;

import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author rodrigo
 */
public class Data {
    private int dia;
    private int mes;
    private String mesExtenso;
    private int ano;

    //Construtor
    public Data(int dia, int mes, int ano) {
        if(ehDataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
            System.out.println("Data inválida!");
        }
}

    //retorna o dia da data digitada
    public int getDia() {
        return dia;
    }

    //retorna o mes da data digitada
    public int getMes() {
        return mes;
    }

    //retorna o mes por extenso
    public String getMesExtenso() {
        Locale locale = new Locale("pt", "BR"); // pt para Português, BR para Brasil
        String mesExtenso = java.time.Month.of(mes).getDisplayName(TextStyle.FULL, locale);

        return mesExtenso;
    }
    
    //retorna o ano da data digitada
    public int getAno() {
        return ano;
    }
    
    //compara a data digitada com a data atual
    public int compara() {
        int anoAtual = java.time.LocalDate.now().getYear();
        int mesAtual = java.time.LocalDate.now().getMonthValue();
        int diaAtual = java.time.LocalDate.now().getDayOfMonth();

        if (ano == anoAtual && mes == mesAtual && dia == diaAtual) {
            System.out.println("As datas são iguais");
            return 0;
        } else if (ano < anoAtual || (ano == anoAtual && mes < mesAtual) || (ano == anoAtual && mes == mesAtual && dia < diaAtual)) {
            System.out.println("A data informada é menor que a atual");
            return -1;
        } else {
            System.out.println("A data informada é maior que a atual");
            return 1;
        }
    }

    //verifica se o ano digitado eh bissexto
    public boolean isBissexto(int ano) {
       return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    //verifica se a data eh valida
    public boolean ehDataValida(int dia, int mes, int ano) {
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        int[] diasDosMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (bissexto) {
            diasDosMeses[2] = 29;
        } else {
            diasDosMeses[2] = 28;
        }

        if (ano >= 1 && mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= diasDosMeses[mes]) {
                return true; // A data é válida
            }
        }
        return false; // A data é inválida
    }
    
    //faz um clone da data digitada
    @Override
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
}

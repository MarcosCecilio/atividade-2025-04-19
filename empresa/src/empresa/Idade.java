package empresa;

import java.time.LocalDate;

public class Idade {
    public static void main(String[] args) throws Exception {
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();

        Integer anoNascimento = Integer.parseInt(args[0]);
        Integer anos = anoAtual - anoNascimento;
        System.err.println("Idade em anos:" + anos.toString());

        Integer meses = (anoAtual - anoNascimento) * 12;
        System.err.println("Idade em meses:" + meses.toString());

        Integer dias = (anoAtual - anoNascimento) * 365;
        System.err.println("Idade em dias:" + dias.toString());

        Integer semanas = (anoAtual - anoNascimento) * 54;    
        System.err.println("Idade em semanas:" + semanas.toString());


    
    



    
    }

    
}

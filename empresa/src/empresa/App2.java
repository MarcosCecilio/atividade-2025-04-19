package empresa;

public class App2 {
    public static void main(String[] args) throws Exception {
        // Verifica se o argumento foi passado
        if (args.length < 2) {
            System.out.println("Por favor, passe o salário como parâmetro.");
            return;
        }

        // Converte o argumento passado para Double
        Double salarioAtual = Double.parseDouble(args[0]);
        Double percentual = Double.parseDouble(args[1]);


        App2 calculadora = new App2();
        Double resultado = calculadora.calcula(salarioAtual, percentual);
        System.out.println("resultado: " + resultado.toString());
    }
        
    public Double calcula(Double salarioAtual, Double percentual) {
        Double acrescimo = salarioAtual * (percentual / 100.000);
        return salarioAtual + acrescimo;
    }
}

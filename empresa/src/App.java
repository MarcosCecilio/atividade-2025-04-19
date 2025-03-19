public class App {
    public static void main(String[] args) throws Exception {
        // Verifica se o argumento foi passado
        if (args.length < 1) {
            System.out.println("Por favor, passe o salário como parâmetro.");
            return;
        }

        // Converte o argumento passado para Double
        Double salarioAtual = Double.parseDouble(args[0]);

        App calculadora = new App();
        Double resultado = calculadora.calcula(salarioAtual);
        System.out.println("resultado: " + resultado.toString());
    }
        
    public Double calcula(Double salarioAtual) {
        Double acrescimo = salarioAtual * 0.25;
        return salarioAtual + acrescimo;
    }
}

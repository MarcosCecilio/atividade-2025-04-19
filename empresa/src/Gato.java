public class Gato {
    public static void main(String[] args) throws Exception {
        // Verifica se o argumento foi passado
        if (args.length < 1) {
            System.out.println("Por favor, passe os parametros");
            return;
        }

        // Converte o argumento passado para Double
        Integer pesoSaco = Integer.parseInt(args[0]);
        Integer gramasCadaGato = Integer.parseInt(args[1]);

        Integer pesoEmGramas = pesoSaco * 1000;
        Integer porcaoDiaria = gramasCadaGato * 2;
        Integer porcaoTotal = porcaoDiaria * 5;
        
        Integer sobra = pesoEmGramas - porcaoTotal;
        if (sobra <= 0) {
            System.out.println("Nao sobrou");
        } else {
            Integer sobraKg = sobra / 1000;
            System.out.println("sobrou: " + sobraKg.toString() + "Kg");
        }
    }
}

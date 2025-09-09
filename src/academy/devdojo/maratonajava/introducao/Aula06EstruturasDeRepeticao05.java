package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorDoCarro = 50000;
        for (int parcela = 1; parcela <= valorDoCarro ; parcela++) {
            double valorParcela = valorDoCarro / parcela;

            if (valorParcela < 1000){
                break;
            }
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }

        }
    }
}

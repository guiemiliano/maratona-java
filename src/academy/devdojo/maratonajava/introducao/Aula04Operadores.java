package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 * numero2;
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != COMPARAR TIPOS QUE PODEM SER COMPARADOS, NÃO DA PRA COMPARAR INT COM STRING
        //menor, maior, menor igual, maior igual, comparando igualdade, diferente
        boolean isDezMaiorQueVinte = 10 != 20;
        System.out.println("10 é diferente de 20? "+ isDezMaiorQueVinte);

        //Operadores lógicos
        //&& (AND E)   || (OR OU)  ! (NOT NÃO)
        int idade = 29;
        double salario = 3500.0;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double currentAccount = 290;
        double savingsAccount = 10000;
        double playstationFivePrice = 5000;
        boolean isPlaystationFiveCanBeBought = currentAccount >= playstationFivePrice || savingsAccount >= playstationFivePrice;

        System.out.println("Playstation five can be bought? " + isPlaystationFiveCanBeBought);

        //Operadores de Atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800

        System.out.println(bonus);

        int contador = 0;
        contador ++;
        contador--;
        contador--;
        ++contador;

        System.out.println(contador);


    }
}

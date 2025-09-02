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
    }
}

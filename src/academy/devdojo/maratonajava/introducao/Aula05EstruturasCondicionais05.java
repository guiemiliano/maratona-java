package academy.devdojo.maratonajava.introducao;


import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando o 1 como domingo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana, considerando domingo como 1 (1 a 7)");
        int dia = scanner.nextInt();

        //char, int, byte, short, enum, String ESSES SÃO OS TIPOS QUE PODEM SER UTILIZADOS
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Terça Feira");
                break;
            case 4:
                System.out.println("Quarta Feira");
                break;
            case 5:
                System.out.println("Quinta Feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido (apenas de 1 a 7)");
                break;
        }
        scanner.close();
    }
}

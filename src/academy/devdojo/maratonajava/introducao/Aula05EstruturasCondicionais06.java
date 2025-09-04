package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
            case 7:
               System.out.println("Final de Semana");
               break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
               System.out.println("Dia útil");
               break;
            default:
                System.out.println("Número inválido, Digite entre 1 e 7");
                break;
        }


        scanner.close();
    }
}

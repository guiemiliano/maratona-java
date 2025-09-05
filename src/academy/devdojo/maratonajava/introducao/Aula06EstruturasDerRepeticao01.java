package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDerRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;

        while (contador < 10){
            System.out.println(contador);
            contador++;
        }

        contador = 0;
        //
        do{
            System.out.println("Dentro do do-while " + contador);
            contador++;
        }while (contador < 10);

        //For
        //variavel, ate onde ela vai, incrementaçãoa té chegar
        for(contador = 0; contador < 10;contador++){
            System.out.println("for " + contador);
        }
    }
}

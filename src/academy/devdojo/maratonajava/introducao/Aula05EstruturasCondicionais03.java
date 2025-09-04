package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário foi maior que 5000
        double salario = 1900;

        // (CONDIÇÃO) ? VALOR SE REAL : VALOR SE FALSO
        String mensagemResultado = (salario > 5000) ? "Eu vou doar 500 para o DevDojo"
                : "Ainda não tenho condições, mas vou ter!";

        System.out.println(mensagemResultado);


    }
}

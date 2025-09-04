package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário foi maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        String mensagemResultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(mensagemResultado);


    }
}

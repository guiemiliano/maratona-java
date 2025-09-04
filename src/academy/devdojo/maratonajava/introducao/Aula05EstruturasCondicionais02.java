package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 = Categoria infantil
        //idade >= 15 && idade < 18 = Categoria Juvenil
        //idade > 18 = Categoria adulta

        int idade = 18;
        String categoria = "";

        if(idade < 15){
            categoria = "Categoria Infatil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}

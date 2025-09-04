package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 10;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if(isAllowedToBuyAlcohol){ //SE
            System.out.println("Authorized to buy alcohol");
        }else {// SE NÃO
            System.out.println("Not authorized to buy alcohol");
        }

        //! Operador de negação
//        if(!isAllowedToBuyAlcohol){
//            System.out.println("Not authorized to buy alcohol");
//        }


    }
}

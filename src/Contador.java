import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        //solicita e grava o primeiro numero
        System.out.println("Digite um numero inteiro");
        Integer numberOne = scanner.nextInt();

        //solicita e grava o segundo numeroj
        System.out.println("Digite outro numero inteiro");
        Integer numberTwo = scanner.nextInt();

        try {
            contarNumero(numberOne, numberTwo);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro numero deve ser menor que o segundo numero!");
        }
        
        scanner.close();
    }

    static void contarNumero(Integer numberOne, Integer numberTwo) throws ParametrosInvalidosException{
        if(numberOne >= numberTwo){
            throw new ParametrosInvalidosException();
        }else{
            Integer countNumber = numberTwo - numberOne;
            Integer cont = 1;
            for(cont = 1; cont <= countNumber; cont++){
                System.out.println("Imprimindo o numeor " + cont);
            }
        }
    }
}

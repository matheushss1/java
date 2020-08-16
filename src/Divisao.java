import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o outro número");
        int numero2 = leitor.nextInt();
        if(numero2 != 0){
            double resultado = numero1/numero2;

            System.out.println(resultado);
        }else{
            System.out.println("O divisor (segundo número) não pode ser zero.");
        }


    }
}

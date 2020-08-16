import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação você quer fazer?");
        System.out.println("(s)oma, su(b)tração, (m)ultiplicação, (d)ivisão:");
        String operador = scanner.nextLine();

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        if(operador.equals("s") || operador.equals("+") || operador.equalsIgnoreCase("soma")){
            double resultado = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        } if(operador.equals("b") || operador.equals("-") || operador.equalsIgnoreCase("subtração")){
            double resultado = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + resultado);
        } if(operador.equals("m") || operador.equals("*") || operador.equalsIgnoreCase("multiplicação")){
            double resultado = numero1 * numero2;
            System.out.println(numero1 + " x " + numero2 + " = " + resultado);
        } if (operador.equals("d") || operador.equals("/") || operador.equalsIgnoreCase("divisão")){
            double resultado = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + resultado);
        }
        scanner.close();
    }
}

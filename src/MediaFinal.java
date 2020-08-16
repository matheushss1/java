import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas das respectivas provas:");
        System.out.println("Prova 1:");
        Double nota1 = scanner.nextDouble();
        System.out.println("Prova 2:");
        Double nota2 = scanner.nextDouble();
        System.out.println("Prova 3:");
        Double nota3 = scanner.nextDouble();
        Double resultado = (nota1 + nota2 + nota3)/3;
        System.out.println("A média final foi: " + resultado);
    }
}

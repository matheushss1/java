import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual foi o tipo de combustível?");
        System.out.println("Álcool, Gasolina: [a]/[g]");
        String combustivel = scanner.nextLine();
        System.out.println("Quantos lítros?");
        Double litros = scanner.nextDouble();
        Double precoAlcool = 2.90;
        Double precoGasolina = 3.30;
        Double resultado;

        if(combustivel.equalsIgnoreCase("a") || combustivel.equalsIgnoreCase("Álcool")){
            combustivel = "álcool";
        }
        if(combustivel.equalsIgnoreCase("g") || combustivel.equalsIgnoreCase("Gasolina")){
            combustivel = "gasolina";
        }
        if(combustivel.equals("álcool") && litros <= 20) {
            resultado = (precoAlcool * litros)-(precoAlcool*0.03*litros);
            System.out.println("Ficou: R$" + resultado);
        }
        if(combustivel.equals("álcool") && litros > 20) {
            resultado = (precoAlcool * litros)-(precoAlcool*0.05*litros);
            System.out.println("Ficou: R$" + resultado);
        }
        if(combustivel.equals("gasolina") && litros <= 20) {
            resultado = (precoGasolina * litros)-(precoGasolina*0.04*litros);
            System.out.println("Ficou: R$" + resultado);
        }
        if(combustivel.equals("gasolina") && litros > 20) {
            resultado = (precoGasolina * litros)-(precoGasolina*0.05*litros);
            System.out.println("Ficou: R$" + resultado);
        }
    }
}

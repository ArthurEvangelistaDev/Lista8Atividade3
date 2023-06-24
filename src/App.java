import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Retangulo local = new Retangulo();

        System.out.print("Informe a Largura do local: ");
        local.ladoA = teclado.nextDouble();

        System.out.print("Informe o Comprimento do local: ");
        local.ladoB = teclado.nextDouble();

        System.out.println("Você vai precisar de " + local.calcularArea() + "M² de piso e " + local.calcularPerimetro()
                + "M de rodapé!");

        teclado.close();
    }
}

import java.util.Scanner;

public class Clase_scanner {
    public static void main(String[] args) {
        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.println("Escriba su nombre, edad y salario: ");

            String nombreUsuario = miScanner.nextLine();

            int edadUsuario = miScanner.nextInt();
            Double salarioUsuario = miScanner.nextDouble();

            System.out.println("Nombre: " + nombreUsuario);
            System.out.println("Edad: " + edadUsuario);
            System.out.println("Salario: " + salarioUsuario);
        }
    }
}

import java.util.Scanner;

public class Importando_clase {
    public static void main(String[] args) {
        try (Scanner objeto = new Scanner(System.in)) {
            System.out.println("Digite su nombre: ");

            String nombreUsuario = objeto.nextLine();
            System.out.println("su nombre es" + nombreUsuario);
        }
    }
}

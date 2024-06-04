import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String fechaPub;

    public Libro(String titulo, String autor, String fechaPub) {
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPub = fechaPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " - " + " Autor: " + autor + " - " + " Fecha de Publicación:" + "[" + fechaPub
                + "]";
    }

}

public class GestorLibros {
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            mostrarMenu();
            int opción = Integer.parseInt(scanner.nextLine());
            switch (opción) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    buscarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    listarLibro();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menu de Gestión de Libros: ");
        System.out.println("1. Agregar nueva Libro");
        System.out.println("2. Buscar un libro");
        System.out.println("3. Elminar Libro");
        System.out.println("4. Listar todas los Libros");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opción: ");
    }

    private static void agregarLibro() {
        System.out.println("Titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println("Agregue la fecha de publicación del libro: ");
        String fecha = scanner.nextLine();
        libros.add(new Libro(titulo, autor, fecha));
        System.out.println("Libro agregado correctamente: ");
    }

    private static void buscarLibro() {
        System.out.println("Nombre del libro que quiere buscar: ");
        String nombre = scanner.nextLine();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                System.out.println(libro);
            } 
        }
        System.out.println("El libro no existe. Revise el titulo e intente nuevamente.");
    }

    private static void eliminarLibro() {
        System.out.println("Nombre del libro a elminiar: ");
        String nombre = scanner.nextLine();
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(nombre));
        System.out.println("Libro eliminado");
    }

    private static void listarLibro() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en este momento.");
        } else {
            System.out.println("Lista de libros agregados: ");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}

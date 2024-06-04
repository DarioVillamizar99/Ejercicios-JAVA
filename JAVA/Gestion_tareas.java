import java.util.ArrayList;
import java.util.Scanner;

class Tarea {
    private String nombre;
    private String descpricion;
    private boolean completada;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descpricion = descripcion;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescpricion() {
        return descpricion;
    }

    public void setDescpricion(String descpricion) {
        this.descpricion = descpricion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return nombre + " - " + descpricion + "[" + (completada ? "Completada" : "Pendiente") + "]";
    }

}

public class Gestion_tareas {
    private static ArrayList<Tarea> tareas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opción = Integer.parseInt(scanner.nextLine());
            switch (opción) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                marcarTareaComp();
                break;
                case 3:
                eliminarTarea();
                break;
                case 4:
                listarTareas();
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
        System.out.println("Menu de Gestión de tareas: ");
        System.out.println("1. Agregar nueva Tarea");
        System.out.println("2. Maracar tarea como completada");
        System.out.println("3. Elminar Tarea");
        System.out.println("4. Listar todas las tareas");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opción: ");
    }

    private static void agregarTarea() {
        System.out.println("Nombre de la tarea: ");
        String nombre = scanner.nextLine();
        System.out.println("Descripcion de la tarea: ");
        String descripcion = scanner.nextLine();
        tareas.add(new Tarea(nombre, descripcion));
        System.out.println("Tarea agregada correctamente.");
    }

    private static void marcarTareaComp() {
        System.out.println("Nombre de la tarea a marcar como completada. ");
        String nombre = scanner.nextLine();
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equalsIgnoreCase(nombre)){
                tarea.completar();
                System.out.println("La tarea ha sido marcada como completada");
            } else {
                System.out.println("Tarea no encontrada.");
            }
            }
    }

    private static void eliminarTarea() {
        System.out.println("Nombre de la tarea que va a eliminar: ");
        String nombre = scanner.nextLine();
        tareas.removeIf(tarea -> tarea.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Tarea elminada");
    }

    private static void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas actualmente");
        } else {
            System.out.println("Lista de tareas: ");
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }
 }

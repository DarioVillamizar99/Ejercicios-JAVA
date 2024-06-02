import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Fecha_hora {
    public static void main(String[] args) {
        LocalDate miFecha = LocalDate.now();
        System.out.println("La fecha del dia de hoy es: " + miFecha);

        LocalTime miHora = LocalTime.now();
        System.out.println("La hora actual es: " + miHora);

        LocalDateTime miFechaHora = LocalDateTime.now();
        System.out.println("La fecha y hora actuales son: " + miFechaHora);
        // para formatear el formato de hora y fecha
        DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

        String fechaFormateada = miFechaHora.format(miFormato);
        System.out.println("La fecha y hora actual despues de formateada es: " + fechaFormateada);
    }
}

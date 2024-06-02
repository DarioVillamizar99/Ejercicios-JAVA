public class Multiples_atributos {
    String nombre = "Deisy";
    String apellido = "Bohada";
    int edad = 54;
    char seudonimo = 'D';
    boolean importante = true;

    public void myMother() {
        System.out.println("Mi madre es la mejor");
    }

    public static void main(String[] args) {
        Multiples_atributos miMadre = new Multiples_atributos();
        System.out.println("Nombre: " + miMadre.nombre + " Apellido: " + miMadre.apellido+ " edad: "+miMadre.edad);
        if (miMadre.importante = true){
            System.out.println("Suedonimo: " + miMadre.seudonimo + " Es importante? pues claro que si.");
        }
    }
}

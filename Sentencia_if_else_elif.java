public class Sentencia_if_else_elif {
    static void metodo(int age){
        if ( age < 18) {
            System.out.println("Acceso denegado: debe ser mayor de edad");
        } else if (age > 18 && age < 64) {
            System.out.println("Acceso permitido: es mayor de edad");
        } else {
            System.out.println("Acceso denegado: es muy mayor de edad");
        }
    }

    public static void main(String[] args) {
        metodo(15);
        metodo(23);
        metodo(65);
    }
}

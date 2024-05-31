abstract class Main {
    public String fname = "Johon";
    public int age = 24;
    public abstract void study(); // metodo absatracto
}

class Estudiante extends Main {
    public int añoGraduacion = 2018;
    public void study() {
        System.out.println("Algo nose que xd");
    }
}

class Scundaria {
    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();

        System.out.println("Nombre: " + objeto.fname);
        System.out.println("Edad: " + objeto.age);
        System.out.println("Año de graduacion: " + objeto.añoGraduacion);
        objeto.study();
    }
}
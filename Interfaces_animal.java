interface Animal2 {
    public void sonidoAnimal();
    public void dormir();
}

class Cerdo2 implements Animal2 {
    public void sonidoAnimal() {
        System.out.println("el cerdo hace : oing oing");
    }
    public void dormir() {
        System.out.println("Zzz");
    }
}

public class Interfaces_animal {
    public static void main(String[] args) {
        Cerdo2 miCerdo = new Cerdo2();

        miCerdo.sonidoAnimal();
        miCerdo.dormir();
    }
}

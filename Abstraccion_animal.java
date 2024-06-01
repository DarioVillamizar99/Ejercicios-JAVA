abstract class Animal {
    public abstract void sonidoAnimal();

    public void dormir() {
        System.out.println("Zzz");
    }
}

class Cerdo extends Animal {
    public void sonidoAnimal() {
        System.out.println("el cerdo hace: oing oing");
    }
}

public class Abstraccion_animal {
    public static void main(String[] args) {
        Cerdo miCerdo = new Cerdo();
        miCerdo.sonidoAnimal();
        miCerdo.dormir();
    }
}

class Animal {
    public void sonidoAnimal() {
        System.out.println(("el animal hace un sonido"));
    }
}

class Vaca extends Animal {
    public void sonidoAnimal() {
        String nombre = "Vaca";
        System.out.println("El "+ nombre +" hace: oing oing");
    }
}

class Perro extends Animal {
    public void sonidoAnimal() {
        System.out.println("El perro hace: guau guau");
    }
}

public class Animal_polimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miVaca = new Vaca();
        Animal miPerro = new Perro();
        miAnimal.sonidoAnimal();
        miVaca.sonidoAnimal();
        miPerro.sonidoAnimal();
    }
}
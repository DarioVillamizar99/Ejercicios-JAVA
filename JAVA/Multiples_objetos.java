public class Multiples_objetos {
    int x = 5;

    public static void main(String[] args) {
        Multiples_objetos objeto1 = new Multiples_objetos();
        Multiples_objetos objeto2 = new Multiples_objetos();

        objeto2.x = 40;

        System.out.println(objeto1.x+2);
        System.out.println(objeto2.x);
    }
}

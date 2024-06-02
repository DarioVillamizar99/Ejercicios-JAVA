public class Constructor {
    int x;

    //Contructor no lleva void, solo public y el NOMBRE DE LA CLASE.
    public Constructor(int y) {
        this.x = y; //this hace referencia al objecto actual que se va a crear
    }
    
    public static void main(String[] args) {
        Constructor objeto = new Constructor(2);
        System.out.println(objeto.x);
    }
}

public class Carro_herencia {
    protected String marca = "Ford";
    public void ruido(){
        System.out.println(("pii, piii!!"));
    }
}

class Carr extends Carro_herencia {
    private String nombreModelo = "Mustang";
    public static void main(String[] args) {
        Carr miCarro = new Carr();

        miCarro.ruido(); // metodo heredado de su padre "Carro_herencia"

        System.out.println(miCarro.marca+" "+ miCarro.nombreModelo); // atributo tanto del padre como del hijo
    }
}

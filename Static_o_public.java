public class Static_o_public {
    static void miMetodoEstatico() {
        System.out.println("No necesita un objeto para ser llamado.");
    }

    public void miMetodoPublico() {
        System.out.println("Necesita si o si, crear un objeto para ser llamado");
    }
    
    public static void main(String[] args) {
        miMetodoEstatico(); //llama el metodo sin necesidad de crear un nuevo objeto

        Static_o_public objeto = new Static_o_public(); //crea el objeto para poder llamar al metodo
        objeto.miMetodoPublico();
    }
}

interface PrimerInterfaz {
    public void miMetodo();
}

interface SegundaInterfaz {
    public void miOtroMetodo();
}

class ClaseDemos implements PrimerInterfaz, SegundaInterfaz {
    public void miMetodo() {
        System.out.println("Algo de texto...");;
    }

    public void miOtroMetodo(){
        System.out.println("...algo mas de texto");
    }
}

public class Interfaces_multiples {
    public static void main(String[] args) {
        ClaseDemos miClase = new ClaseDemos();

        miClase.miMetodo();
        miClase.miOtroMetodo();
    }
}

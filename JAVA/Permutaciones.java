public class Permutaciones {
    public static void main(String[] args) {
        //Ensalda

        //String ingredientes[] = {"legucha","tomate", "cebolla", "mostaza", "pimienta"};
        String ingredientes[] = new String[100];

        double n, k;
        n = ingredientes.length;
        k = 3; //numero para agrupaciones

        // Ecuación para permutaciones !n/!(n-k)
        Factorial facto = new Factorial();
        double nF = facto.factorial(n);
        double nkF = facto.factorial(n-k);
        System.out.println(nF);
        double resultado = nF/nkF;

        System.out.println(resultado);
    }
}

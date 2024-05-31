public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        int[] serie = generarSerie(n);

        for (int num : serie) {
            System.out.println(num + " ");
        }
    }

    public static int[] generarSerie(int n) {
        int [] serie = new int[n];
        if (n > 0) {
            serie[0] = 0;
        }
        if (n > 1) {
            serie[1] = 1;
        }

        for (int i = 2; i < n; i++){
            System.out.println("Cuando i= " + i +" ---> "+ (serie[i] = serie[i-1] + serie[i-2]));
        }
        return null;
    }

}
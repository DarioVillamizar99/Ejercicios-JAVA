public class Recursividad_suma {
    public static void main(String[] args) {
        int resultado = sum(3);
        System.out.println(resultado);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

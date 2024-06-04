public class Factorial {

    public double factorial(Double n) {
        return (n == 0)?1:n*factorial(n-1); //utilizando recursividad
    }


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(100.0));
    }
}

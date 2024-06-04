import java.util.Scanner;

class NumeroComplejo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public NumeroComplejo sumar(NumeroComplejo otro) {
        return new NumeroComplejo(
            this.parteReal + otro.parteReal,
            this.parteImaginaria + otro.parteImaginaria
        );
    }

    public NumeroComplejo restar(NumeroComplejo otro) {
        return new NumeroComplejo(
            this.parteReal - otro.parteReal,
            this.parteImaginaria - otro.parteImaginaria
        );
    }

    public NumeroComplejo multiplicar(NumeroComplejo otro) {
        return new NumeroComplejo(
            this.parteReal * otro.parteReal - this.parteImaginaria * otro.parteImaginaria,
            this.parteReal * otro.parteImaginaria + this.parteImaginaria * otro.parteReal
        );
    }

    public NumeroComplejo dividir(NumeroComplejo otro) {
        double divisor = otro.parteReal * otro.parteReal + otro.parteImaginaria * otro.parteImaginaria;
        if (divisor == 0) {
            throw new ArithmeticException("División por cero.");
        }
        return new NumeroComplejo(
            (this.parteReal * otro.parteReal + this.parteImaginaria * otro.parteImaginaria) / divisor,
            (this.parteImaginaria * otro.parteReal - this.parteReal * otro.parteImaginaria) / divisor
        );
    }

    public double modulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }

    @Override
    public String toString() {
        return parteReal + " + " + parteImaginaria + "i";
    }
}

public class CalculadoraComplejos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    operar("sumar");
                    break;
                case 2:
                    operar("restar");
                    break;
                case 3:
                    operar("multiplicar");
                    break;
                case 4:
                    operar("dividir");
                    break;
                case 5:
                    mostrarModulo();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Calculadora de Números Complejos:");
        System.out.println("1. Sumar dos números complejos");
        System.out.println("2. Restar dos números complejos");
        System.out.println("3. Multiplicar dos números complejos");
        System.out.println("4. Dividir dos números complejos");
        System.out.println("5. Mostrar el módulo de un número complejo");
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static NumeroComplejo ingresarNumeroComplejo(String mensaje) {
        System.out.println(mensaje);
        System.out.print("Parte real: ");
        double parteReal = Double.parseDouble(scanner.nextLine());
        System.out.print("Parte imaginaria(sin la i): ");
        double parteImaginaria = Double.parseDouble(scanner.nextLine());
        return new NumeroComplejo(parteReal, parteImaginaria);
    }

    private static void operar(String operacion) {
        NumeroComplejo num1 = ingresarNumeroComplejo("Ingresa el primer número complejo:");
        NumeroComplejo num2 = ingresarNumeroComplejo("Ingresa el segundo número complejo:");
        NumeroComplejo resultado = null;

        switch (operacion) {
            case "sumar":
                resultado = num1.sumar(num2);
                break;
            case "restar":
                resultado = num1.restar(num2);
                break;
            case "multiplicar":
                resultado = num1.multiplicar(num2);
                break;
            case "dividir":
                try {
                    resultado = num1.dividir(num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }

    private static void mostrarModulo() {
        NumeroComplejo num = ingresarNumeroComplejo("Ingresa el número complejo:");
        System.out.println("El módulo es: " + num.modulo());
    }
}


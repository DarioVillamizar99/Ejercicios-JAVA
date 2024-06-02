public class For_anidado {
    public static void main(String[] args) {
        int numTabla = 5;   
        int cantMultiplos = 11;
        for (int j = 1; j <= numTabla; j++){
            for (int i = 1; i < cantMultiplos; i++){
                int resultado = j * i;
                System.out.println(j+" x " +i+ " = "+ resultado);
            }
        }
    }

}

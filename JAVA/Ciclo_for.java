
public class Ciclo_for {
    public static void main(String[] args) {
        String name = "Hola, que tal";
        String[] letras = new String[name.length()];

        for (int i = 0; i < name.length();i++){
            letras[i] = String.valueOf(name.charAt(i));
        }
        
        StringBuilder resultado = new StringBuilder();

        for (int i=0; i<letras.length;i++) {
            if (i%2 != 0){
                resultado.append(letras[i].toLowerCase());
            }else {
                resultado.append(letras[i].toUpperCase());
            }
        }
        System.out.println(resultado.toString());
}}

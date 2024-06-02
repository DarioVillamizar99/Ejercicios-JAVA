class ClaseEXterna {
    int x = 10;

    class ClaseInterna {
        int y = 5;
    }
}

public class Clases_internas {
    public static void main(String[] args) {
        ClaseEXterna miClaseExtEXterna = new ClaseEXterna();
        ClaseEXterna.ClaseInterna miClaseInterna = miClaseExtEXterna.new ClaseInterna();

        System.out.println(miClaseExtEXterna.x + miClaseInterna.y);
    }
}

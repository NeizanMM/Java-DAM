import java.util.Scanner;

public class act2 {
    public static void main (String[] args) {
        act2 programa = new act2();
        programa.inici();

    }
    public static void inici () {
        float valorAltura, valorRadi;
        System.out.println("introdueix una altura");
        valorAltura = pregunta();
        System.out.println("Introdueix un radi");
        valorRadi = pregunta();
        System.out.println("L'area es: " + calculArea(valorAltura, valorRadi));
        System.out.println("El volum es: " + calculVolum(valorAltura, valorRadi));
    }
    public static float pregunta () {
        Scanner sc = new Scanner(System.in);
        float valor;
        boolean comprovant = false;

        do {
            valor = sc.nextFloat();
            if (valor < 0) {
                System.out.println("Torna ha introduir");
            } else {
                comprovant = true;
            }
        } while (comprovant != true);
        return valor;
    }

    public static float calculArea (float valorAltura, float valorRadi) {
        float area = (float) (2 * Math.PI * valorRadi * (valorAltura + valorRadi));
        return area;
    }

    public static float calculVolum (float valorAltura, float valorRadi) {
        float volum = (float) (Math.PI * valorRadi * valorRadi * valorAltura);
        return volum;

    }
}

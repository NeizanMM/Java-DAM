public class prova {
    public static void main(String[] args) {
        int comptador;

        System.out.println("El programa compta de 1 a 10");

        comptador = 1;

        while (comptador <= 5) {
            System.out.println(comptador);
            comptador++;
        }

/*
        int comptador1;
        int valorRandom;
        int modulo;

        comptador1 = 1;

        do {
            valorRandom = (int)(Math.random()*10 +1);
            System.out.println("El numero random " + comptador1 + " es: ");
            System.out.println(valorRandom);
            comptador1++;
            modulo = valorRandom % 2;
        } while (comptador1 <= 10 && modulo != 0);

         /*

        for (int comptador2 = 1; comptador2 <= 5; comptador2++) {
            int valorRandom1;
            valorRandom1 = (int)(Math.random()*10 +1);
            System.out.println("El numero random " + comptador2 + "es: ");
            System.out.println(valorRandom1);

          */
        }
    }

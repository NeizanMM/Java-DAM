import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasenya;
        String resposta;
        String rang;

        // declarem les variables

        System.out.println("Jugador 1 introdueix la contrasenya, no li diguis al jugador 2");
        contrasenya = sc.nextLine();
        contrasenya = contrasenya.toLowerCase();

        // introduim contrasenya i comvertim la variable a minucules

        if (contrasenya.isEmpty()) {
            System.out.println("no s'ha introduit cap contrasenya ( sortin del programa)");

            // comprovem contrasenya te contingut

        } else {
            System.out.println("jugador 2 comença a endevinar");
            do {
                System.out.print("\n");
                resposta = sc.nextLine();
                resposta = resposta.toLowerCase();

                // obrim el bucle de resposta del usuari i convertim el contingut a la variable

                if (resposta.isEmpty()) {
                    System.out.println("No has escrit res ");

                    // comprovem que la variable no es buida

                } else {
                    rang = resposta.substring(0, contrasenya.length());

                    // limitem la resposta als caracteeres de la contrasenya

                    for (int comptador = 0; comptador < contrasenya.length(); comptador++) {
                        char charactercontrasenya = contrasenya.charAt(comptador);
                        char characterresposta = resposta.charAt(comptador);

                        // bucle per comprovar cada caracter

                        if (charactercontrasenya == characterresposta) {
                            System.out.print(charactercontrasenya);

                            // comparem els caracters per veure si es correcte o no

                        } else {
                            System.out.print("*");

                            // si no son iguals fiquem un *
                        }
                    }
                    System.out.println("\n");
                }

            } while (!contrasenya.equalsIgnoreCase(resposta));

            // repeteix fins que sigui la resposta correcta

            System.out.println("Has endevinat la contrasenya, que es :" + contrasenya);
        }
    }
}

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String deu,vint,trenta,quaranta,cincuanta,seixanta,setanta,vuitanta,noranta,u,dos,tres,quatre,cinc,sis,set,vuit,nou;
        deu = "deu";
        vint = "vint";
        trenta = "trenta";
        quaranta = "quaranta";
        cincuanta = "cincuanta";
        seixanta = "seixanta";
        setanta = "setanta";
        vuitanta = "vutanta";
        noranta = "noranta";
        u = "u";
        dos = "dos";
        tres = "tres";

        int numero;
        System.out.println("Introdueix un numero del 0 al 99: ");
        numero = sc.nextInt();

        int decimal = (numero / 10);
        int unitat = (numero % 10);

    }
}

import java.util.Arrays;

public class ex2_2 {
    public static void main(String[] args) {

        int llista[] = {5, 3, 1, 9, 7};
        int comptador = 0, peque, temp, posicionpeque;

        for (int num = 0; num < llista.length; num++) {
            peque = llista[num];
            temp = llista[num];
            posicionpeque = num;
            for (int i = num; i < llista.length; i++) {
                if (peque > llista[i]) {
                    peque = llista[i];
                    posicionpeque = i;
                }
            }
            llista[num] = peque;
            llista[posicionpeque] = temp;
        }
        System.out.println(Arrays.toString(llista));
    }
}

package programamedia;

import java.util.Scanner;


public class Programamedia {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi: " + m);
        if (m > 9) {
            System.out.println("Parabens!!!");
        } else {
            System.out.println("Estude mais bb!!!");
        }
    }
}
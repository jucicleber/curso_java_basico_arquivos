
package calcularmaiormenor;

import java.util.Scanner;

import java.util.Calendar;
        
public class CalcularMaiorMenor {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int nasc = t.nextInt();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int i = year-nasc;
        if (i>=18){
            System.out.printf("Maior de idade  %d Anos(o) de idade.", i );
        }else{
            System.out.printf("Menor de idade %d Anos(o) de idade.", i);
        }
    }
    
}


package sistemapernas;

import java.util.Scanner;
public class SistemaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas: ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a):");
        switch(perna){
            case 1:
                tipo = "Saci!!!";
                break;
            case 2:
                tipo = "Humano!!!";
                break;
            case 3:
                tipo = "Corvo de três pernas!!!";
                break;
            case 4:
                tipo = "Vaca!!!";
                break;
            case 6:
                tipo = "Aranha!!!";
                break;
            default:
                tipo = "ET";
                break;
    }
        System.out.println(tipo);
    }

    private static void swith(int perna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

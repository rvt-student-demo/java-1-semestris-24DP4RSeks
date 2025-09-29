package rvt;
import java.util.Scanner;

public class Delikatese{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi prece: ");
        String prece = scanner.nextLine();
        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.print("Ekspress piegade (0==ne, ja==1):" );
        int piegade = Integer.valueOf(scanner.nextLine());
        System.out.println();
        System.out.println("Rekins: ");
        System.out.println(prece + "    " + cena);

        double piegadesCena;
        if (piegade == 1) {
            System.out.println("piegade    " + 3.00);
            piegadesCena = 3.00;
        } else{
            if (cena <= 10) {
                System.out.println("piegade   " + 2.00);
                piegadesCena = 2.00;
            } else{
                System.out.println("piegade   " + 0.00);
                piegadesCena = 0.00;
            }
        }
        double sum = cena + piegadesCena;
        System.out.println("kopa: " + sum);
        

    }
}
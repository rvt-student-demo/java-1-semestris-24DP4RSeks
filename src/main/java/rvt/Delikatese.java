package rvt;
import java.util.Scanner;

public class Delikatese{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi prece: ");
        String prece = scanner.nextLine();
        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.print("Ekspress piegāde (0==nē, jā==1):" );
        int piegade = Integer.valueOf(scanner.nextLine());
        System.out.println();
        System.out.println("Rēķins: ");
        System.out.println(prece + "    " + cena);

        double piegadesCena;
        if (piegade == 1) {
            System.out.println("piegāde    " + 3.00);
            piegadesCena = 3.00;
        } else{
            if (cena <= 10) {
                System.out.println("piegāde   " + 2.00);
                piegadesCena = 2.00;
            } else{
                System.out.println("piegāde   " + 0.00);
                piegadesCena = 0.00;
            }
        }
        double sum = cena + piegadesCena;
        System.out.println("kopā: " + sum);
        

    }
}
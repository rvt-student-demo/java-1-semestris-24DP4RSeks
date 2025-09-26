package rvt;
import java.util.Scanner;

public class bobdiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int screwPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        System.out.print("Skrūvju skaits: ");
        int screws = Integer.valueOf(scanner.nextLine());
        System.out.print("Uzgriežņu skaits: ");
        int nuts = Integer.valueOf(scanner.nextLine());
        System.out.print("Paplāksņu skaits: ");
        int washers = Integer.valueOf(scanner.nextLine());

        if (nuts < screws) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
        }
        if (washers < screws * 2) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
        }
        int sum = (screwPrice * screws)+(nutPrice * nuts)+(washerPrice * washers);
        System.out.println("Kopējā cena: " + sum);

        
    }
}

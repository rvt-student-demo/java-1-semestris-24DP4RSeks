package rvt;
import java.util.Scanner;
public class printUntilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        Integer number = scanner.nextInt();
        printUntilNumber(number, start);
    }
    public static void printUntilNumber(int number, int start){
        while (start <= number){
            System.out.println(start);
            start++;
        }

    }
}

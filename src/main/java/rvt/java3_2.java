package rvt;
import java.util.Scanner;
public class java3_2 {
    public static void main(String[] args) {
        onlyTheseNumbers();
    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[] list = {72, 2, 8, 11, -1};
        System.out.print("From where? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?: ");
        int second = Integer.valueOf(scanner.nextLine());
        for(int i = first; i <= second; i++){
            System.out.println(list[i]);
        }
    }
    public static void listSize() {
        
    }
}


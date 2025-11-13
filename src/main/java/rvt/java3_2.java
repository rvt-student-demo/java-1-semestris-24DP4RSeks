package rvt;
import java.util.Arrays;
import java.util.Scanner;
public class java3_2 {
    public static void main(String[] args) {
        onlyTheseNumbers();
    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[] list = {72, 2, 8, 11, -1};
        System.out.println(Arrays.toString(list));
        System.out.print("From where?: ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where?: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        for (int i = list[first]; i <= list[second]; i++){
            System.out.println(list[i]);
        }

    }
}


package rvt;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // type[] arrayName = new type[ lenght ]
        int lenght = 0;
        System.out.print("Give me the lenght of the array:");
        int arrayLenght = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= arrayLenght;){
            lenght += 1;
            i++;
        }
        int[] skaitli = new int[lenght];
        for (int i = 0; i < arrayLenght;i++) {
            System.out.print("Give me the "+ i+" number:");
            skaitli[i] = Integer.valueOf(scanner.nextLine());
            
        }
        
        System.out.println("Lenght of an array: " + skaitli.length);
        // Arrays.toString(...)
        System.out.println("Array: " + Arrays.toString(skaitli));
        // New way to add variables to array
        int[] debil = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(debil));
    }
}

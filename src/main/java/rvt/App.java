package rvt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        greet();
        printtext();
    }
    public static void greet() {
    System.out.println("Greetings from the method world!");
}
    public static void printtext() {    
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < count; i++){
            System.out.println("In a hole in the ground there lived a method");
        }
}
}

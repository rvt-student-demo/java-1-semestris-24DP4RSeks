package rvt;
import java.util.Scanner;
public class MainProgramStatic {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers: ");
        while(true){
            
            number = Integer.valueOf(scanner.nextLine());
            if (number != -1){
                statistics.addNumber(number);
            }
            else{
                break;
            }
            
        }
        System.out.println("Sum: " + statistics.sum());
        
        
        
        
    }
}
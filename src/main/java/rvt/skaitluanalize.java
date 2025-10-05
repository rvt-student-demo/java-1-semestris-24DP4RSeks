package rvt;
import java.util.Scanner;
public class skaitluanalize{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sksum = 0;
        int sum = 0;
        double avg = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int x = 1;
        while (true){
            if (x > 0){
                System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis patrauc ievadi): ");
                x = Integer.valueOf(scanner.nextLine());
                if (x > 0){
                    sksum = sksum + 1;
                    sum = sum + x;
                    if (sksum > 0){
                        avg = sum / sksum;
                    }
                    if (x > max){
                        max = x;
                    }
                    if (x < min){
                        min = x;
                    }
                    
                }
                else{
                    continue; 
                }
                
            }
            else {
                System.out.println("Ievadito skaitlu skaits: " + sksum);
                System.out.println("Skaitlu summa: " + sum);
                System.out.println("Videja vertiba: " + avg);
                System.out.println("Lielakais skaitlis: " + max);
                System.out.println("Mazakais skaitlis: " + min);
                break;
            }
        }   
        
 

    }
}

package rvt;
import java.util.Scanner;
public class whiletrue {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        while (true) {
            if (x > 5) {
                pauseProgramExecution(); // uz 1 sek
                System.out.print("x = " + x + "\t");
                x = x - 1;
                continue;
            }
            System.out.println("x in power of two: " + x*2);
            break;
        }



    }

    private static void pauseProgramExecution() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pauseProgramExecution'");
    }
}

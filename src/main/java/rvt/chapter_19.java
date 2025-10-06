package rvt;
import java.util.Scanner;
public class chapter_19 {
    public static void main(String[] args) {
        ex6();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start:");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println();
        if (start > end){
            System.out.println("Start nevar but vairak neka end!");
        }
        else{
            while(start != end +1) {
                System.out.println(start);
                start = start + 1;
            }
        }
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        if (n <= 0){
            System.out.println("Ievadi veselo pozitivu skaitli!");
        }
        else{
            for(int i = 0; i < n + 1; i++){
                sum = sum + i;
            }
        }
        int form_sum = (n*(n+1))/2;
        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + form_sum);
    }
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        if (n <= 0){
            System.out.println("Ievadi veselo pozitivu skaitli!");
        }
        else{
            for(int i = 1; i < n + 1; i++){
                sum =  sum + (i*i);
            }
        }
        int form_sum = (n*(n+1)*(2*n+1))/6;
        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + form_sum);
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Low:");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter High:");
        int high = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        if (low > high){
            System.out.println("Kluda!");
        }
        else{
            for (int i = low; i < high + 1; i++){
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);

    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inputString = String.valueOf(scanner.nextLine());
        System.out.println();
        int times = inputString.length();
        for (int i = 0; i < times+1; i++){
            System.out.println(inputString);
        }

    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");
        String first = String.valueOf(scanner.nextLine());
        System.out.println("Enter second word:");
        String second = String.valueOf(scanner.nextLine());
        int time1 = first.length();
        int time2 = second.length();
        int sum = time1+time2;
        System.out.print(first);
        for (int i = 1; i <= 30-sum; i++){
            System.out.print(".");
        }
        System.out.print(second);
    }



}

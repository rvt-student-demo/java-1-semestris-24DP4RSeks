package rvt;

public class chapter_60 {
    public static void main(String[] args) {
        Exercise1();
    }
    public static void Exercise1() {
        int[] val = {0, 1, 2, 3}; 

        int sum = val[0] + val[1] + val[2] + val[3];
 
        System.out.println( "Sum of all numbers = " + sum );
    }
    public static void Exercise2() {
        int[] val = {13, -4, 82, 17}; 
        int[] twice;
        twice[0] = val[0]*2;
        twice[1] = val[1]*2;
        twice[2] = val[2]*2;
        twice[3] = val[3]*2;
        
        System.out.println( "Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    
        // Construct an array object for twice.

        
        // Put values in twice that are twice the
        // corresponding values in val.


    
        System.out.println( "New Array: " 
            + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
}


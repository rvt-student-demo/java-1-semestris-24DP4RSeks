package rvt;
public class Statistics {
    private int count;
    private int sum;
    private int even;
    private int odd;
    
    public Statistics() {
        int numberCount = 0;

    }

    public void addNumber(int number) {
        count += 1;

        sum += number;
        
        if (number % 2 == 0){
            even += number;
        }
        if (number % 2 != 0){
            odd += number;
        }
    }

    public int getCount() {
        return count;
        
    }
    
    public int sum() {
        return sum;
        
    }

    public double average() {
        return sum / (double) count;
        
    }

    public int even() {
        return even;
        
    }
    public int odd() {
        return odd;
        
    }
}
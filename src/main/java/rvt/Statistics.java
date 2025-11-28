package rvt;
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        int numberCount = 0;

        

        
    }

    public void addNumber(int number) {
        count += 1;

        sum += number;
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
}
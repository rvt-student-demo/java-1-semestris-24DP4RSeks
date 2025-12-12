package rvt;

public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int study(){
        return this.credits += 1;
    }

    public int credits(){
        return this.credits;
    }

    @Override
    public String toString() {
        return this.getName() + "\n  " + this.getAddress() + "\n  Study credits " + credits;
    }
}

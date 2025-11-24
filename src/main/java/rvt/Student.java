package rvt;

public class Student {

    private String name;
    private int age;
    private int persCode;
    
    public String getName(){

        return this.name;
    }
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.toString();
        System.out.println(s1);
    }

    public void Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public Student(String n) {
        name = n;
    }

    
}

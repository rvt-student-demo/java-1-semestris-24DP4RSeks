package rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class java3_2 {
    public static void main(String[] args) {
        onlyTheseNumbers();
        listSize();
        onTheList();
        removeLast();
    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] list = {72, 2, 8, 11, -1};

        System.out.print("From where? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int second = Integer.valueOf(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;
        while (true) {
            
            System.out.print("Give me the name(type q to exit): ");
            name = scanner.nextLine();

            if (name.equals("q")){
                break;
            }

            names.add(name); 
        }

        System.out.println("in total: " + names.size());
        }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Emma");
        list.add("Alex");
        list.add("Mary");
        String name;
        System.out.print("Search for? ");
        name = scanner.nextLine();

        if (list.contains(name)) {
            System.out.println(name + " was found!");
        }
        else {
            System.out.println(name + " was not found!");
        }
        System.out.println();
        System.out.println();
        
    }
    public static void removeLast() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);

        int size = strings.size();
        strings.remove(size-1);
        System.out.println(strings);
    }
}




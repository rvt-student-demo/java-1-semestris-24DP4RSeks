package rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class Books{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        bookInfo();

    }

    public static void bookInfo(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> page = new ArrayList<>();
        ArrayList<String> year = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String titles = scanner.nextLine();

            if(titles.equals(" ")){
                break;
            }

            name.add(titles);

            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            page.add(pages);
            
            System.out.print("Publication year: ");
            String years = scanner.nextLine();
            year.add(years);
            
        }

        System.out.println();
        System.out.print("What information will be printed: ");

        String info = scanner.nextLine();
        if(info.equals("everything")){
            for(int i = 0; i< name.size(); i++){
                System.out.println("Title: " + name.get(i));
                System.out.println("Pages: " + page.get(i));
                System.out.println("Publication year: " + year.get(i));
            }
        }
        else if(info.equals("name")){
            for(int i = 0; i< name.size(); i++){
                System.out.println(name.get(i));
            }
        }

    }
}
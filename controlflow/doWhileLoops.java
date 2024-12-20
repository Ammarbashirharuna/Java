package controlflow;

import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do{
           
            System.out.println("Enter a name: ");
            name = scanner.next();
            System.out.println(name);
        } while (!name.equals("Ammar"));
        scanner.close();
    }
}

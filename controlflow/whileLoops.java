package controlflow;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inpute = "";
        while (!inpute.equals("quite")) {
            System.out.print("Enter Value: ");
            inpute = input.next();
            System.out.println(inpute);
       }
        input.close();
    }
}

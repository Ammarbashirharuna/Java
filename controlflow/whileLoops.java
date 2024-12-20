package controlflow;
import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first loop
        String inpute = "";
        while (true) {
            System.out.print("Enter Value: ");
            inpute = scanner.next();
            if (inpute.equals("pass"))
                continue;
            if (inpute.equals("quite"))
                break;
            System.out.println(inpute);
        }
       
        // second loop
        int num1 = 3;
        while (num1 != 3) {
            System.out.print("Enter a number to check: ");
            num1 = scanner.nextInt();
            System.out.println(num1);
        }
       
//    the third loop
        String admin = "";
        while(!admin.equals("Ammar"))
        {
            System.out.print("Enter admin name: ");
            admin = scanner.next();
            System.out.println(admin);

        }
       scanner.close();
    }
     
   
}

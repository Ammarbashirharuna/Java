package programs;
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Enter a Number");
        Scanner number = new Scanner(System.in);

        int enteredNumber = number.nextInt();
        if (enteredNumber % 5 == 0 && enteredNumber % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (enteredNumber % 5 == 0)
            System.out.println("Fizz");
        else if (enteredNumber % 3 == 0)
            System.out.println("Buzz");
        else 
            System.out.println(enteredNumber);
         am works correctly");
        
        number.close();
    }
}

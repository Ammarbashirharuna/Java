import java.util.Scanner;
public class ReadingInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " " + "Years old");
        // to collect a floating point numbers
        System.out.print("Enter your price");
        float price = scanner.nextFloat();
        System.out.println("the price you enter is" + price);

        //  to collect double numbers as input 
        System.out.print("Enter the double numbers ");
        double newprice = scanner.nextDouble();
        System.out.println("The double number you have entered it appear to be" + newprice);

        //  collecting a string from the user or reading string input
        System.out.print("Enter your name");
        String name = scanner.next();
        System.out.println("Your are" + name);

        //  collecting the string using nextline in order to call toaking twice
        scanner.nextLine();
        System.out.print("Who are you ");
        String yname = scanner.nextLine().trim();
        System.out.println("Welcome sir" + yname);
    
    }
}
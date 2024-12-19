package controlflow;

public class ifstatement {
    public static void main(String[] args) {
        int temprature = 32;
        if (temprature > 20) {
            System.out.println("its a hot day");
            System.out.println("Drink water ");
        } 
        else if (temprature > 20 && temprature < 32)
            System.out.println("beautiful day");
         else
             System.out.println("Cold day");
         // simplfying if else statement
         int income = 120_000;
         boolean hasHighincome = (income > 100_000);
         System.out.println(hasHighincome);
        
    }
}

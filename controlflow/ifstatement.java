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
        
    }
}

package controlflow;

public class logivcalOperators {
    public static void main(String[] args) {
        int temprature = 22;
        boolean isWarm = temprature > 20 && temprature < 30;
        System.out.println(isWarm);
        boolean hasHighincome = true;
        boolean hasCredit = true;
        System.out.println(hasHighincome || hasCredit);

    }
}

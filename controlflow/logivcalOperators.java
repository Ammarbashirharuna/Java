package controlflow;

public class logivcalOperators {
    public static void main(String[] args) {
        int temprature = 22;
        boolean isWarm = temprature > 20 && temprature < 30;
        System.out.println(isWarm);
        boolean hasHighincome = true;
        boolean hasGoodCredit = true;
        boolean hasCreminalRecord = false;
        System.out.println((hasHighincome || hasGoodCredit) && !hasCreminalRecord);

    }
}

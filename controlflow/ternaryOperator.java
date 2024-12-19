package controlflow;

public class ternaryOperator {
    public static void main(String[] args) {
        int income = 200_000;
        String className = income > 120_000 ? "firstName" : "Endname";
        System.out.println(className);
    }
}

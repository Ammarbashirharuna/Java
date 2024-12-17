public class Casting {
    public static void main(String[] args) {// Explicit casting example
    double x = 10.0;
    int y = (int) x;
    System.out.println(y);
    // Implicit casting example
    short m = 10;
    int s = m + 5;
    System.out.println(s);
    //  converting a string to an integer
    String j = "10";
    int i = Integer.parseInt(j) + 5;
    System.out.println(i);
    //  converting a string to a double
    String k = "10.1";
    double d = Double.parseDouble(k) + 5;
    System.out.println(d);
    }
}

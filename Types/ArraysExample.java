import java.util.Arrays;
// import java.lang.objects.toString; 

public class ArraysExample{

    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 3, 6, 8, };
        Arrays.sort(numbers);
        System.out.println(numbers);
        String[] names = { "Alice", "Bob", "Charlie", "David" };
        System.out.println(Arrays.toString(names));


    }
}
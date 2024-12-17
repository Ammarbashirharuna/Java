public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(5.6F);
        System.out.println(result); // Output: 6
        int anotherResult = (int) Math.ceil(1.5F);
        System.out.println(anotherResult);
        //  another methosd is floor() for flooring numbers.
        int thirdResult = (int) Math.floor(1.5F);
        System.out.println(thirdResult);
        // math.max for finding maximum value.
        int max = Math.max(45, 50);
        System.out.println(max);
        //  random for genetating random value.
        int random = (int)(Math.random() * 100);
        System.out.println(random);
    }
}

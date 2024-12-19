package controlflow;

public class forLoops {
    public static void main(String[] args) {
        // when we only have single statement to execute no need for braces
        for (int i = 0; i < 10; i++)
            System.out.println("Hello world" + i);
            // using parenthesis
            for (int i = 0; i < 5; i++) {
                System.out.println("i really love nabila" + i);
                System.out.println("and i hope she sleep well");
            }
            for (int i = 5; i > 0; i--)
                System.out.println("it reduce" + i);
    }
}

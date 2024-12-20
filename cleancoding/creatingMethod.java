package cleancoding;

public class creatingMethod {
    public static void main(String[] args) {
        greatUSer("Ammar", "Bashir");
        String messege = greatAdmin("Ammar");
        System.out.println(messege);

    }

    // methods that return no value
    public static void greatUSer(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // methods that return a string value
    public static String greatAdmin(String admin) {
        return "Hello" + admin;
    }

}
public class Dog {
    public String name;
    public int age;
    public String food;

    public Dog(String name, int age, String food){
        this.age = age;
        this.food = food;
        this.name = name;
    }

    public int dogAge(int age){
        return age;
    }

    public void berk(){
        System.out.println("Woof");
    }

}

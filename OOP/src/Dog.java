public class Dog {
    private String name;
    private int age;
    public String food;

    public Dog(String name, int age, String food){
        this.age = age;
        this.food = food;
        this.name = name;
    }
    public void setAge(int age){
        System.out.println(age);
    }

    public void berk(){
        System.out.println("Woof");
    }

    public void getInfo(String name, int age, String food){
        System.out.println("The Dog name is " + name + "and his food is " + food + "and his age is " + age);
    }

}

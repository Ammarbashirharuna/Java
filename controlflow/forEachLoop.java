package controlflow;

public class forEachLoop {
    public static void main(String[] args) {
        String[] fruits =  {"mango", "apple", "Banana", "Guava"};

    // using for loop to iterate over the item 
    for (int i = 0; i < fruits.length; i++)
        System.out.println(fruits[i]);
    //    using for each loop
    for (String fruit : fruits)
        System.out.println(fruit);
    
    }
}

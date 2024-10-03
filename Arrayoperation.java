import java.util.*;
class Arrayoperation{
public static void main(String A[]){
ArrayList<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("orange");
fruits.add("banana");
fruits.add("banana");
fruits.add(0,"at zero"); 
System.out.println(fruits);
System.out.println(fruits.get(0));
fruits.set(0,"Apple");
System.out.println(fruits);
fruits.remove(1);
System.out.println(fruits);
fruits.remove("banana");
System.out.println(fruits);
System.out.println(fruits.size());
fruits.clear();
System.out.println(fruits);
System.out.println(fruits.size());
}

}
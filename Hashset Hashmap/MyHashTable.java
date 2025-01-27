package Hashset;
import java.util.HashMap;

public class MyHashTable {
    public static void main(String[] args) {
        HashMap<String,Integer> myHashMap = new HashMap<>();

        myHashMap.put("John",30);
        myHashMap.put("Stacy",19);
        myHashMap.put("Doe",35);

        System.out.println("Keys: " +  myHashMap.keySet());
        System.out.println("Values: " +  myHashMap.values());

        System.out.println(myHashMap);

        myHashMap.remove("Stacy");

        System.out.println("New hashmap: " + myHashMap);

    }
}

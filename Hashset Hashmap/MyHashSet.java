package Hashset;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> myset = new HashSet<>();
        myset.add(10);
        myset.add(20);
        myset.add(30);

        
        System.out.println(myset);

        myset.add(20);

        System.out.println(myset); //notice no change since Hashsets cannot have duplicates

        for(int num : myset){
            System.out.println(num);
        }

        myset.remove(30);
        System.out.println(myset);

        
    }

}

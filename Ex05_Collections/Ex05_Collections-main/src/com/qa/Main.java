package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail",3);

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        // Trying to add other animals to a cat list (expected error):
//        ArrayList<Cat> catList = new ArrayList<Cat>();
//
//        catList.add(c2);
//        catList.add(d);
//        catList.add(r);
//        catList.add(r2);
//
//        for (int x = 0; x < animalList.size(); x++){
//            System.out.println(animalList.get(x));
//        }

        // Using HashMaps

        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        System.out.println("\nIterating through each key value pair in the set:");
        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }
        // Using a Set
        HashSet<Animal> set = new HashSet<>();
        set.addAll(animalList);


        set.add(c);
        set.add(c2);

        System.out.println("\nIterating after attempting to add duplicates");
        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
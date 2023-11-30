package com.aditya.Hashmaps;
import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MapUsingHash {

    private Entity[] entites;

    public MapUsingHash() {
        entites = new Entity[100];
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TreeMap <String, Integer> map = new TreeMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 96);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Aditya", 34));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(25);
        set.add(27);
        set.add(85);
        set.add(89);
        set.add(21);

        System.out.println(set);
    }
}

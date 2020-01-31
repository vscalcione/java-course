package it.intersistemi.corsojava.collections;

import java.util.*;

public class UserCollectionForeach {

    public static void main(String[] args) {
        double[] doubleArray = { 1.0, 5.4, 7.2, 54.8, 41.2 };
        String[] stringArray = { "string1", "string2", "string3" };
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        printCollections(doubleArray, stringArray, map);
        mapIteraction(map);
        entrySetIteraction(map);
        List<Double> listArray = new ArrayList<>(Arrays.asList(new Double[] {1.0, 5.4, 7.2, (double) 45, 54.8, 41.2}));
        Iterator listArrayIterator = listArray.iterator();
        while(listArrayIterator.hasNext()) {
            Double tmp = (double) listArrayIterator.next();
            System.out.print(tmp + " , ");
        }
    }

    public static void mapIteraction(Map<String, Integer> map) {
        Set<String> mapKey = map.keySet();
        Iterator<String> mapKeyIterator = mapKey.iterator();
        while(mapKeyIterator.hasNext()) {
            String mapKey1 = mapKeyIterator.next();
            System.out.print("MapKey: " + mapKey1 + " , ");
        }
        Iterator<Integer> mapValueIterator= map.values().iterator();
        while(mapValueIterator.hasNext()) {
            Integer mapValue1 = mapValueIterator.next();
            System.out.println("MapValue: " + mapValue1);
        }
    }

    public static void entrySetIteraction(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> mapEntrySetIterator = mapEntrySet.iterator();
        while(mapEntrySetIterator.hasNext()) {
            Map.Entry<String, Integer> mapEntry = mapEntrySetIterator.next();
            String mapKey1 = mapEntry.getKey();
            Integer mapValue1 = mapEntry.getValue();
            System.out.println("Key: " + mapKey1 + " Value: " + mapValue1);
        }
    }

    public static void printCollections(double[] doubleArray, String[] stringArray, Map<String, Integer> map) {
        for (double a : doubleArray) {
            System.out.print(a + " , ");
        }
        System.out.println("");
        System.out.println("==================== Print string array ====================");
        for (String s : stringArray) {
            System.out.print(s + " , ");
        }
        System.out.println("");
        System.out.println("==================== Stampa keySet della Map ====================");
        for (String str : map.keySet()) {
            System.out.print(str + " , ");
        }
        System.out.println("");
        System.out.println("==================== Stampa valori della Map ====================");
        for (Integer intValue : map.values()) {
            System.out.print(intValue + " , ");
        }
    }
}
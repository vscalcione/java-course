package it.intersistemi.corsojava.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericsTestMain {

    public static void main(String[] args) {

        //First List
        List<String> firstList = new ArrayList<String>();
        firstList.add("value1");
        firstList.add("value2");
        firstList.add("value3");
        firstList.add("value4");
        firstList.add("value5");

        //Second List
        List<Number> secondList = new ArrayList<Number>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3.0);
        secondList.add(4.3f);
        secondList.add(15.3);

        //Third List
        List<Double> thirdList = new ArrayList<Double>();
        thirdList.add(3.9);
        thirdList.add(1.2);
        thirdList.add(6.2);
        thirdList.add(5.7);
        thirdList.add(4.3);

        //Fourth List
        List<Boolean> fourthList = new ArrayList<Boolean>();
        fourthList.add(true);
        fourthList.add(false);
        fourthList.add(true);
        fourthList.add(Boolean.FALSE);
        fourthList.add(Boolean.TRUE);

        //Fifth List
        List<Character> fifthList = new ArrayList<Character>();
        fifthList.add('c');
        fifthList.add('i');
        fifthList.add('a');
        fifthList.add('o');
        fifthList.add('!');

        System.out.println("==== Print firstList ===========================");
        printList(firstList);
        System.out.println("==== Print secondList ===========================");
        printList(secondList);
        System.out.println("==== Print thirdList ===========================");
        printList(thirdList);
        System.out.println("==== Print fourthList ===========================");
        printList(fourthList);
        System.out.println("==== Print fifthList ===========================");
        printList(fifthList);
    }

    public static void printList(List<?> list){
        for (Object object : list) {
            if(object instanceof String) {
//				System.out.println("");
                System.out.println("Print string: "+object);
            }else if(object instanceof Number) {
//				System.out.println("");
                System.out.println("Print number: "+object);
            }else if(object instanceof Double) {
                System.out.println("Print double: "+object);
            }else if(object instanceof Boolean) {
                System.out.println("Print boolean: "+object);
            }
            else {
//				System.out.println("");
                System.out.println("Print generic ?: "+object);
            }
        }
    }
}

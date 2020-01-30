package it.intersistemi.corsojava.generics.exercises;

import java.util.*;

public class GroupPersonMain {

    public static void main(String[] args) {
        List<Person> personList = generatePersonList();
        Map<Sex, List<Person>> personGroup = new HashMap<>();
        for(Person person : personList){
            Sex sex = person.getSex();
            if(!personGroup.containsKey(sex)){
                personGroup.put(sex, new ArrayList<>());
            }
            personGroup.get(sex).add(person);
        }

//        questa parte di codice è un implementazione che ci permette di accedere in modo controllato alla collection di tipo Map
//        List<Person> sexList = personGroup.get(sex);
//        if(sexList == null){
//            sexList = new ArrayList<>();
//            personGroup.put(sex, sexList);
//        }
        Set<Map.Entry<Sex, List<Person>>> personGroupEntrySet = personGroup.entrySet();
        Iterator<Map.Entry<Sex, List<Person>>> personGroupEntrySetIterator = personGroupEntrySet.iterator();
        while(personGroupEntrySetIterator.hasNext()){
            Map.Entry<Sex, List<Person>> personGroupEntry = personGroupEntrySetIterator.next();
            Sex sex = personGroupEntry.getKey();
            List<Person> people = personGroupEntry.getValue();
            System.out.println(" \n " + "People sex: " + sex);
            for(Person person : people){
                String surname = person.getSurname();
                String name = person.getName();
                System.out.println("Name: " + name + ", Surname: " + surname);
            }
        }
    }

    private static List<Person> generatePersonList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("name1", "surname1", Sex.MAN));
        people.add(new Person("name2", "surname2", Sex.WOMAN));
        people.add(new Person("name3", "surname3", Sex.WOMAN));
        people.add(new Person("name4", "surname4", Sex.MAN));
        people.add(new Person("name5", "surname5", Sex.MAN));
        people.add(new Person("name6", "surname6", Sex.WOMAN));
        people.add(new Person("name7", "surname7", Sex.MAN));
        people.add(new Person("name8", "surname8", Sex.WOMAN));
        people.add(new Person("name9", "surname9", Sex.MAN));
        people.add(new Person("name10", "surname10", Sex.MAN));
        return people;
    }
}
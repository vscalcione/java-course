package it.intersistemi.corsojava.lambdaexpressions.exercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonMain {

    public static void main(String[] args) {
        List<Person> roster = generatePeople();

        System.out.println("\n" + "======================== printPeopleOlderThan ========================= ");
        printPeopleOlderThan(roster, 20);

        System.out.println("\n" + "======================== printPeopleAgeBetween ======================== ");
        printPeopleAgeBetween(roster, 25, 30);

        System.out.println("\n" + "======================== printPeopleNameStartsWith ======================== ");
        printPeopleNameStartsWith(roster, "N");

        System.out.println("\n" + "======================== printPeople ======================== ");
        printPeople(roster, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getSex() == Person.Sex.MEN && person.getAge() >= 19 && person.getAge() <= 40;
            }
        });
        System.out.println("\n" + "======================== LambdaExpression ======================== ");

        System.out.println("\n" + "======================== printPeople ======================== ");
        printPeople(roster, p -> p.getSex() == Person.Sex.MEN && p.getAge() >= 19 && p.getAge() <= 40);

        System.out.println("\n" + "======================== processPeopleWithFunctions ======================== ");
        processPeopleWithFunction(roster, p -> p.getSex() == Person.Sex.WOMAN && p.getAge() > 20,
                p -> p.getName(),
                s -> System.out.println(s)
        );

        System.out.println("\n" + "======================== processPeopleWithFunctions (with generics) ======================== ");
        processElements(roster, p -> p.getSex() == Person.Sex.WOMAN  && p.getAge() > 20,
                p -> p.getName(),
                s -> System.out.println(s)
        );
        List<String> stringList = Arrays.asList(new String[] {"1", "2", "3"});
        processElements(stringList, s -> s.equals("2"),
                s -> Integer.parseInt(s),
                i -> System.out.println(i + 1)
        );
    }

    private static List<Person> generatePeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("name1", "name1.surname@gmail.com", LocalDate.of(2000, 1, 2), Person.Sex.MEN));
        people.add(new Person("name2", "name2.surname@gmail.com", LocalDate.of(1999, 2, 4), Person.Sex.MEN));
        people.add(new Person("name3", "name3.surname@gmail.com", LocalDate.of(1998, 3, 6), Person.Sex.MEN));
        people.add(new Person("name4", "name4.surname@gmail.com", LocalDate.of(1997, 4, 8), Person.Sex.MEN));
        people.add(new Person("name5", "name5.surname@gmail.com", LocalDate.of(1996, 5, 10), Person.Sex.MEN));
        people.add(new Person("name6", "name6.surname@gmail.com", LocalDate.of(1995, 6, 12), Person.Sex.MEN));
        people.add(new Person("name7", "name7.surname@gmail.com", LocalDate.of(1994, 7, 14), Person.Sex.MEN));
        people.add(new Person("name8", "name8.surname@gmail.com", LocalDate.of(1993, 8, 16), Person.Sex.MEN));
        people.add(new Person("name9", "name9.surname@gmail.com", LocalDate.of(1992, 9, 18), Person.Sex.MEN));
        people.add(new Person("name10", "name01.surname@gmail.com", LocalDate.of(1991, 10, 20), Person.Sex.MEN));
        return people;
    }

    private static void printPeopleOlderThan(List<Person> roster, int age){
        for(Person person : roster){
            if(person.getAge() <= age)
                person.printPerson();
        }
    }

    private static void printPeopleAgeBetween(List<Person> roster, int maxAge, int minAge){
        for(Person person : roster){
            if(person.getAge() >= minAge && person.getAge() <= maxAge)
                person.printPerson();
        }
    }

    private static void printPeopleNameStartsWith(List<Person> roster, String namePrefix){
        for(Person person : roster){
            if(person.getName().startsWith(namePrefix))
                person.printPerson();
        }
    }

    private static void printPeople(List<Person> roster, CheckPerson tester){
        for(Person person : roster){
            if(tester.test(person))
                person.printPerson();
        }
    }

    private static void processPeopleWithFunction(List<Person> roster, Predicate<Person> tester, Function<Person, String> mapper,
            Consumer<String> block){
        for(Person person : roster){
            if(tester.test(person)){
                String data = mapper.apply(person);
                block.accept(data);
            }
        }
    }

    private static <X, Y> void processElements(Iterable<X> source, Predicate <X> tester, Function<X, Y> mapper, Consumer <Y> block){
        for(X person : source){
            if(tester.test(person)){
                Y data = mapper.apply(person);
                block.accept(data);
            }
        }
    }
}
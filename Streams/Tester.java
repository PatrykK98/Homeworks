package Exercise;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static Exercise.Sex.FEMALE;
import static Exercise.Sex.MALE;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Antonio", "Loby", LocalDate.of(1955,02,01), MALE,
                3500, new Address("San Francisco") );
        Person person2 = new Person("Bartek", "Płonek", LocalDate.of(1996,02,01), MALE,
                4500, new Address("Montreal") );
        Person person3 = new Person("Mateusz", "Benz", LocalDate.of(1954,02,01), MALE,
                5500, new Address("Krosno") );
        Person person4 = new Person("Monika", "Szałaj", LocalDate.of(1995,02,01), FEMALE,
                4999, new Address("Rzeszów") );
        Person person5 = new Person("Kasia", "Sikora", LocalDate.of(1992,02,01), FEMALE,
                4500, new Address("Sanok") );
        Person person6 = new Person("Alicja", "Walkowicz", LocalDate.of(1980,02,01), FEMALE,
                20000, new Address("Kraków") );
        Person person7= new Person("Marcin", "Łukaszczyk", LocalDate.of(2004,02,01), MALE,
                0, new Address("Kraków") );
        Person person8= new Person("Marta", "Kielar", LocalDate.of(2006,02,01), FEMALE,
                0, new Address("Kraków") );
        List<Person> people = List.of(person1,person2,person3,person4,person5, person6,person7,person8);

        System.out.println("\nReversed by BirthDate list of man older than 65 y.o.");
        List<Person> sortedOldMan = people.stream()
                .filter(person -> person.getSex().equals(MALE))
                .filter(person -> person.getBirthDay().getYear()<1956)
                .sorted((comparing(Person::getBirthDay))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(sortedOldMan);

        System.out.println("\nReversed by FirstName list of woman which earns less than 5000 ");
        List<Person> womanEarnsLess= people.stream()
                .filter(person -> person.getSex().equals(FEMALE))
                .filter(person -> person.getSalary()<5000)
                .sorted((comparing(Person::getFirstName))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(womanEarnsLess);

        System.out.println("\nReversed by LastName list of teenagers from Kraków");
        List<Person> youngPeopleFromKrk = people.stream()
                .filter(person -> person.getBirthDay().getYear()>2003)
                .filter(person -> person.getAddress().getCity().equals("Kraków"))
                .sorted((comparing(Person::getLastName))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(youngPeopleFromKrk);

        System.out.println("\nSorted by BirthDate list of people out of Kraków");
        List<Person> peopleOutOfKrk = people.stream()
                .filter(person -> !person.getAddress().getCity().equals("Kraków"))
                .sorted((comparing(Person::getBirthDay)))
                .collect(Collectors.toList());
        System.out.println(peopleOutOfKrk);

        System.out.println("\nAverage salary:");
        int avarageSalary = people.stream()
                .map(Person::getSalary)
                .reduce(0,(a,b)-> (a+b));
        System.out.println(avarageSalary/people.size());

        System.out.println("\nNumber of woman from Kraków");
        long numberOfWomenInKrk = people.stream()
                .filter(person -> person.getAddress().getCity().equals("Kraków"))
                .filter(person -> person.getSex().equals(FEMALE))
                .count();

        System.out.println(numberOfWomenInKrk);

        System.out.println("\nNumber of man older than 65 y.o.");
        long numberOfMenOlderThan65 = people.stream()
                .filter((person -> person.getBirthDay().getYear()<=1956))
                .count();
        System.out.println(numberOfMenOlderThan65);

        System.out.println("\nThe oldest person");
        Person oldestPerson = people.stream()
                .min(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println(oldestPerson);

        System.out.println("\nThe youngest person from Kraków");
        Person youngestPerson = people.stream()
                .filter(person -> person.getAddress().getCity().equals("Kraków"))
                .max(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println(youngestPerson);

        System.out.println("\nTotal salary");
        int totalSalary = people.stream()
                .map(Person::getSalary)
                .reduce(0, (a,b)-> a+b);
        System.out.println(totalSalary);


        System.out.println("\nFinding people with name starts from A from previously generated collections");

        boolean sortedOldManFirstLetterA = sortedOldMan.stream()
                .anyMatch(person -> person.getFirstName().charAt(0) == 'A');
        System.out.println(sortedOldManFirstLetterA);

        boolean womanEarnsLessFirstLetterA = womanEarnsLess.stream()
                .anyMatch(person -> person.getFirstName().charAt(0) == 'A');
        System.out.println(womanEarnsLessFirstLetterA);

        boolean youngPeopleFromKrkFirstLetterA = youngPeopleFromKrk.stream()
                .anyMatch(person -> person.getFirstName().charAt(0) == 'A');
        System.out.println(youngPeopleFromKrkFirstLetterA);

        boolean peopleOutOfKrkFirstLetterA = peopleOutOfKrk.stream()
                .anyMatch(person -> person.getFirstName().charAt(0) == 'A');
        System.out.println(peopleOutOfKrkFirstLetterA);

        System.out.println("\nDoes any person contain 'A' from last name");

        boolean sortedOldPeopleLastNameWithA= sortedOldMan.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println(sortedOldPeopleLastNameWithA);

        boolean womanEarnsLessLastNameWithA = womanEarnsLess.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println(womanEarnsLessLastNameWithA);

        boolean youngPeopleFromKrkLastNameWithA = youngPeopleFromKrk.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println(youngPeopleFromKrkLastNameWithA);

        boolean peopleOutOfKrkLastNameWithA = peopleOutOfKrk.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println(peopleOutOfKrkLastNameWithA);
    }
}

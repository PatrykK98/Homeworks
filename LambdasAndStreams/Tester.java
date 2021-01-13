package Exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static Exercise.Sex.FEMALE;
import static Exercise.Sex.MALE;
import static java.util.Comparator.reverseOrder;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Maciek", "Loby", LocalDate.of(1955,02,01), MALE,
                3500, new Address("San Francisco") );
        Person person2 = new Person("Bartek", "Płonek", LocalDate.of(1996,02,01), MALE,
                4500, new Address("Montreal") );
        Person person3 = new Person("Mateusz", "Benz", LocalDate.of(1954,02,01), MALE,
                5500, new Address("Krosno") );
        Person person4 = new Person("Monika", "Mercedes", LocalDate.of(1995,02,01), FEMALE,
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
                .sorted((Comparator.comparing(Person::getBirthDay))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(sortedOldMan);

        System.out.println("\nReversed by FirstName list of woman which earns less than 5000 ");
        List<Person> womanEarnsLess= people.stream()
                .filter(person -> person.getSex().equals(FEMALE))
                .filter(person -> person.getSalary()<5000)
                .sorted((Comparator.comparing(Person::getFirstName))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(womanEarnsLess);

        System.out.println("\nReversed by LastName list of teenagers from Kraków");
        List<Person> youngPeopleFromKrk = people.stream()
                .filter(person -> person.getBirthDay().getYear()>2003)
                .filter(person -> person.getAddress().getCity().equals("Kraków"))
                .sorted((Comparator.comparing(Person::getLastName))
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(youngPeopleFromKrk);

        System.out.println("\nSorted by BirthDate list of people out of Kraków");
        List<Person> peopleOutOfKrk = people.stream()
                .filter(person -> !person.getAddress().getCity().equals("Kraków"))
                .sorted((Comparator.comparing(Person::getBirthDay)))
                .collect(Collectors.toList());
        System.out.println(peopleOutOfKrk);



    }
}

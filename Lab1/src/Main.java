import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* 1. Stwórz obiekt klasy Person
            - klasa ta powinna mieć dwa prywatne pola odpowiedniego typu: age i name
            - powinny być dwa konstruktory – jeden przyjmujący zarówno age i name oraz drugi przyjmujący tylko name
            - stwórz metody pozwalające na dostęp do tych pól i zmianę ich wartości */

        /* 2. Obsługa wyjątków
            - utwórz nowy wyjątek InvalidAgeException
            - zabezpiecz metody z poprzedniego zadania przez podaniem nieprawidłowego wieku
            - dodaj obsługę wyjątku poprzez try catch -> W wypadku błędu wypisz wiadomość w konsoli */

        /* 3. Kolekcje
            - utwórz trzy obiekty klasy Person
            - wykorzystaj następujące interfejsy by zebrać te obiekty w kolekcje: List, Set, Map
            - wypisz kolekcje w konsoli */

        /* 4. Stream API & Optional - Korzystając z listy Person wykorzystaj Stream API do wykonania następujących zadań
            4.1. Operacja reduce
                - Oblicz średni wiek osób w liście
            4.2. Operacja map
                - Stwórz nową listę, która zawiera tylko imiona osób z poprzedniej listy
            4.3. Operacja filter
                -Stwórz listę osób w wieku powyżej 25 lat
            4.4. Operacja sort
                - Posortuj listę osób alfabetycznie według ich imion
            4.5. Operacja forEach
                - Wypisz imiona i wiek wszystkich osób z listy w konsoli
            4.6. Operacja min/max
                - Znajdź osobę o najniższym/największym wieku a następnie wypisz ją w konsoli.
                - Zwróć uwagę, że te operacje zwracają typ Optional, który należy obsłużyć. */

        try {
            Person p1 = new Person("Roland", 20);
            Person p2 = new Person("Michał", 25);
            Person p3 = new Person("Paweł", 30);


            List<Person> list1 = new ArrayList<>();
            list1.add(p1);
            list1.add(p2);
            list1.add(p3);

            Set<Person> list2 = new HashSet<>();
            list2.add(p1);
            list2.add(p2);
            list2.add(p3);

            Map<String, Person> list3 = new HashMap<>();
            list3.put(p1.getName(), p1);
            list3.put(p2.getName(), p2);
            list3.put(p3.getName(), p3);

            System.out.println("List: " + list1);
            System.out.println("Set: " + list2);
            System.out.println("Map: " + list3);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
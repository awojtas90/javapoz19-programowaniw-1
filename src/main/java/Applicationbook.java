import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Applicationbook {
    public static void main(String[] args) {
        List<book>books = Arrays.asList(
                new book("W pustyni i w puszczy", 1910, 300),
                new book("Krzyżacy", 1900, 1000),
                new book("Dziady III", 1832, 250),
                new book("Dziady I", 1860, 350),
                new book("Zielona mila", 1996, 290),
                new book("Balladyn", 1839, 400),
                new book("Harry Potter i Czara ognia", 2005, 650),
                new book("Harry Potter i Ksiaze Polkrwi", 2009, 650),
                new book("Romeo i Julia", 1595, 340));

       books.stream()
               .forEach(book -> System.out.println(book));

       books.stream()
               .filter(book -> book.getReleaseyear()<2000)
               .filter(book -> book.getPages()>300)
               .map(book -> book.getName())
               .forEach(book -> System.out.println(book));






        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = integers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 5)
                .filter(n -> n < 10)
                .map(n -> n * 2)
//                .forEach(n -> System.out.println(n))
//                .forEach(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collect);

                   /* @Override
                    public boolean test(Integer integer) {
                        return false;
                    }
                })

        books.stream()*/

    }
}

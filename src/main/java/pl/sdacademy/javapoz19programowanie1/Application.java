package pl.sdacademy.javapoz19programowanie1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, Nation.PL);
        Author author2 = new Author("Adam", "Mickiewicz", 1798, Nation.PL);


        Author author = new Author();
        author.setFirstname("Stephen");
        author.setLastname("Anglik");
        author.setBirthyear(1900);
        author.setNation(Nation.ENG);


        List<Author> authors = Arrays.asList(author, author1, author2,
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));

        showByNation(authors, Nation.PL);
        showModernAuthors(authors, 1900);
        showByNationAnBirthYear(authors, Nation.PL, 1800);
        System.out.println(groupByNation(authors));

    }

    private static void showByNation(List<Author> authors, Nation nation) {
        for (Author author : authors) {
            if (author.getNation().equals(nation)) {
                System.out.println(author);

            }

        }
    }

    private static void showModernAuthors(List<Author> authors, int birthyear) {
        for (Author author : authors) {
            if (author.getBirthyear() > (birthyear)) {
                System.out.println(author);

            }
        }
    }

    public static void showByNationAnBirthYear(List<Author> authors, Nation nation, int birthyear) {
        for (Author author : authors) {
            if (author.getNation().equals(nation) && author.getBirthyear() > birthyear) {
                System.out.println(author);
            }
        }

    }

    private static Map<Nation, List<Author>> groupByNation(List<Author> authors) {
        Map<Nation, List<Author>> map = new HashMap<>();
        for (Author author : authors) {
            map.putIfAbsent(author.getNation(), new ArrayList<>());
            map.get(author.getNation()).add(author);

        }
        return map;
    }
}




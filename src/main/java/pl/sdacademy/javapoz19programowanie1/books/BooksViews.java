package pl.sdacademy.javapoz19programowanie1.books;

import pl.sdacademy.javapoz19programowanie1.Nation;

import java.util.List;
import java.util.Scanner;

public class BooksViews {
    private Scanner scanner;

    public BooksViews(Scanner scanner){
        this.scanner = scanner;
    }

    public int startMenu(){
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("3. Koniec");
        return getDecisionAfterEnter ();
    }

    public int getDecisionAfterEnter() {
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }
   
    public int authorsMenu (List<Author> authors)
    {
        authors.stream()
                .forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1. Find by nation (PL, ENG, USA)"); //TODO zrobic dynamiczne
        System.out.println("2. Find by after birthYear "); 
        System.out.println("0. Wroc");
        return getDecision();


    }

    public int getDecision(){return scanner.nextInt();}

    public Nation getNation() {
        String nationAsString = scanner.nextLine().trim();
        return Nation.valueOf(nationAsString);


    }

    public int getBirthYear(){
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        return birthYear;

    }
}

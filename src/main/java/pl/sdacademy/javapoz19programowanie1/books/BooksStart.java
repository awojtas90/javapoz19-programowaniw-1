package pl.sdacademy.javapoz19programowanie1.books;

import pl.sdacademy.javapoz19programowanie1.Nation;

import java.util.List;
import java.util.Scanner;

public class BooksStart {

    private BooksViews views;
    private AuthorsRepository authorsRepository;


    public BooksStart() {

        this.views = new BooksViews(new Scanner(System.in));
        this.authorsRepository = new inMemoryAthorsRepository();
    }

    public void start() {
        boolean flag = true;
        do {
            int decision = views.startMenu();
            switch (decision) {
                case 1:
                    authorsView();
                    break;
                case 2:
                    booksView();
                    break;
                default:
                    flag = false;

            }
        } while (flag);

    }

    private void booksView() {
        System.out.println("Tutaj będą ksiązki");
    }

    private void authorsView() {
        boolean flag = true;
        List<Author> authors = authorsRepository.findAll();

        do {
            int decision = views.authorsMenu(authors);
            switch (decision) {
                case 1:
                    Nation nation = views.getNation();
authors = authorsRepository.findByNation(nation);


                    break;
                case 2:
                  int  birthYear= views.getBirthYear();
                  authors = authorsRepository.findAfterBirthYear(birthYear);
                  break;

                default:
                    flag = false;

            }

        } while (flag);

    }

}



package pl.sdacademy.javapoz19programowanie1;

import pl.sdacademy.javapoz19programowanie1.Author;

public class Book {
    private String name;
    private int releaseyear;
    private int pages;
    private Author author;

    public Book() {

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String name, int releaseyear, int pages, Author author) {
        this.name = name;
        this.releaseyear = releaseyear;
        this.pages = pages;
        this.author = author;

    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", releaseyear=" + releaseyear +
                ", pages=" + pages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

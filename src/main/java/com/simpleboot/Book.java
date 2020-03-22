package com.simpleboot;

/**
 * Created by Arsen Adzhiametov on 18-Nov-14
 */
public class Book {

    Long id;
    String author;
    String title;
    Integer numberOfPages;

    public Book() {
    }

    public Book(Long id, String author, String title, Integer numberOfPages) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}

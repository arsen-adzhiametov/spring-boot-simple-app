package com.simpleboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Arsen Adzhiametov on 18-Nov-14
 */
@Repository
public class BookDao {

    List<Book> books = new ArrayList<Book>(Arrays.asList(
            new Book(1L, "alala", "Good book", 234),
            new Book(2L, "asasa", "Bad book", 432)));

    int counter = books.size();

    Book getBookById(Long id) {
        if (id != null) {
            for (Book book : books) {
                if (id.equals(book.getId())){
                    return book;
                }
            }
        }
        return null;
    }

    List<Book> findAll() {
        return books;
    }

    void save(Book book) {
        if(book.getId() == null){
            book.setId((long) counter++);
            books.add(book);
        }else{
            books.set(book.getId().intValue(), book);
        }

    }

}

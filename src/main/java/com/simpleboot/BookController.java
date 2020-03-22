package com.simpleboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

/**
 * Created by Arsen Adzhiametov on 18-Nov-14
 */
@Controller
@RequestMapping("book")
public class BookController {
    
    @Autowired
    BookDao bookDao;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Book.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String id) {
                setValue(bookDao.getBookById(Long.valueOf(id)));
            }
        });
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(@RequestParam("id") Book book, Model model) {
        model.addAttribute("book", book);
        return "bookPage";
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("books", bookDao.findAll());
        return "listBooks";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddBookForm(){
        return "addBookForm";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    String add(Book book) {
        bookDao.save(book);
        return "redirect:get?id=" + book.getId();
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    String showEditBookForm(@RequestParam("id") Book book, Model model){
        model.addAttribute("book", book);
        return "editBookForm";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    String edit(Book book){
        bookDao.save(book);
        return "redirect:get?id="+book.getId();
    }
}

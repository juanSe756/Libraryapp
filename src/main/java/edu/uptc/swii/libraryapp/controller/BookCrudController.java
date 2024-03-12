package edu.uptc.swii.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import edu.uptc.swii.libraryapp.domain.Book;
import edu.uptc.swii.libraryapp.service.BookService;
import edu.uptc.swii.libraryapp.service.EditorialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookCrudController {

    private final EditorialService editorialService;
    private final BookService bookService;

    public BookCrudController(EditorialService editorialService, BookService bookService) {
        this.editorialService = editorialService;
        this.bookService = bookService;
    }

    @RequestMapping("/book/create")
    public String showAddForm(Model model) {
        model.addAttribute("editorials", editorialService.searchAll());
        model.addAttribute("book", new Book());
        return "formbook.html";

    }

    @RequestMapping("/book/search")
    public String saveBook(Book book) {
        bookService.save(book);
        return "redirect:/";

    }

}

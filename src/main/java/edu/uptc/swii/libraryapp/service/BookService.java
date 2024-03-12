package edu.uptc.swii.libraryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import edu.uptc.swii.libraryapp.domain.*;
import edu.uptc.swii.libraryapp.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> searchFeatured() {
        return bookRepository.findAll();
    }

    public List<Book> searchByEditorial(int editorialId) {
        return bookRepository.searchByEditorial(editorialId);
    }

    public List<Book> search(String consult) {
        return bookRepository.search(consult);
    }
    public void save(Book book) {
        bookRepository.save(book);
    }

}

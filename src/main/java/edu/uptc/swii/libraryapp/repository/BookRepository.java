package edu.uptc.swii.libraryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.uptc.swii.libraryapp.domain.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {



    @Query("SELECT b FROM Book b WHERE b.editorial.id = ?1 ORDER BY b.name")
    List<Book> searchByEditorial(int editorialId);

    @Query("SELECT b FROM Book b WHERE b.name LIKE %?1%")
    List<Book> search(String consult);

}

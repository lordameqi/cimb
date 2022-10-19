package id.belajar.springdatajpa.repository;

import id.belajar.springdatajpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();
    List<Book> findAllByWriter(String writer);

    @Query(
        nativeQuery = true,
        value = "select id from book"
    )
    List<Book> findAllQuery();
}

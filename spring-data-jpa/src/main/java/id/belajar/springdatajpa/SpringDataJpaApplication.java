package id.belajar.springdatajpa;

import id.belajar.springdatajpa.entity.Book;
import id.belajar.springdatajpa.entity.BookCategory;
import id.belajar.springdatajpa.repository.BookCategoryRepository;
import id.belajar.springdatajpa.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    private final Logger LOG= LoggerFactory.getLogger(SpringDataJpaApplication.class);


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
//        Book book1 = new Book();
//        book1.setTitle("Belajar Sholat");
//        book1.setWriter("Rachmad Fadillah");
//        book1.setIsbn("IS-0101");
//
//        Book book2 = new Book();
//        book2.setTitle("Belajar Sholat");
//        book2.setWriter("Rachmad Fadillah");
//        book2.setIsbn("IS-0101");
//
//        bookRepository.save(book1);
//        bookRepository.save(book2);
//
//        LOG.info("Berhasil Menyimpan "+book1);
//        LOG.info("Berhasil Menyimpan2 "+book2);

        List<Book> books =bookRepository.findAll();
        LOG.info("Books: "+books);
        final String writer = "Rachmad Fadillah";
        List<Book> boks = bookRepository.findAllByWriter(writer);
        LOG.info("books writer "+boks);

        //kategori
        BookCategory bookCategory = bookCategoryRepository.save(
                new BookCategory("Prorgraming",
                        new Book("Java 1","TETEN N","SE1912"),
                        new Book("Java 2","TETEN N","SE1912"))
        );

    }
}

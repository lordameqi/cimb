package id.belajar.springdatajpa.entity;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBookCategory;

    private String nameCategory;
    @OneToMany(
            mappedBy = "bookCategory",
            cascade = CascadeType.ALL
    )
    private List<Book> books;


    public BookCategory() {
    }

    public BookCategory(String nameCategory, Book... books) {
        this.nameCategory = nameCategory;
        this.books = Stream.of(books).collect(Collectors.toList());
        this.books.forEach(x -> x.setBookCategory(this));
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "idBookCategory=" + idBookCategory +
                ", nameCategory='" + nameCategory + '\'' +
                ", books=" + books +
                '}';
    }

    public long getIdBookCategory() {
        return idBookCategory;
    }

    public void setIdBookCategory(long idBookCategory) {
        this.idBookCategory = idBookCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}

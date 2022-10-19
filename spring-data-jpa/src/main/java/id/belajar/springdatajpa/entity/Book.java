package id.belajar.springdatajpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity

public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(nullable = false)
    private String title;

   @Column(nullable = false)
    private String writer;

   @Column(nullable = false)
    private String isbn;

   @ManyToOne
   @JoinColumn
   private BookCategory bookCategory;
   public Book(){

   }


    public Book(String title, String writer, String isbn) {
        this.title = title;
        this.writer = writer;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

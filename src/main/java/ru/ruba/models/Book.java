package ru.ruba.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Название книги не должно быть пустым")
    @Size(min = 2, max = 100, message = "Название книги не должно быть от 2 до 100 символов длиной")
    private String title;

    @NotEmpty(message = "Имя автора не должно быть пустым")
    @Size(min = 3, max = 100, message = "Название книги должно быть от 3 до 100 символов")
    private String author;

    @Min(value = 1600, message = "Год написания не должен быть меньше 1600 года")
    private int year_of_writing;

    public Book() {}

    public Book(String title, String author, int year_of_writing) {
        this.title = title;
        this.author = author;
        this.year_of_writing = year_of_writing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_of_writing() {
        return year_of_writing;
    }

    public void setYear_of_writing(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }
}

package ru.ruba.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {

    private int id;
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 10, max = 100, message = "Имя должно быть от 10 до 100 символов длиной")
    private String fio;
    @Min(value = 1900, message = "Год рождения должен быть больше, чем 1900")
    private int year_of_birth;

    public Person() {}

    public Person(String fio, int year_of_birth) {
        this.fio = fio;
        this.year_of_birth = year_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}

package edu.banki.libraryapp.model;

import java.time.LocalDate;

public class Book {

    private String author;
    private String title;
    private int year;
    private String category;
    private LocalDate acquisitionDate;

    public Book(String author, String title, int year, String category, LocalDate acquisitionDate) {
        setAuthor(author);
        setTitle(title);
        setYear(year);
        setCategory(category);
        setAcquisitionDate(acquisitionDate);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", year=" + getYear() +
                ", category='" + getCategory() + '\'' +
                ", acquisitionDate=" + getAcquisitionDate() +
                '}';
    }
}

package edu.banki.libraryapp.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataManagerTest {

    @Test
    void testStockMultipleCategories() {

        //Arrange
        Book book1 = new Book("Author 1", "Title1", 2000, "Fiction", LocalDate.now());
        Book book2 = new Book("Author 2", "Title2", 2000, "Horror", LocalDate.now());
        Book book3 = new Book("Author 3", "Title3", 2000, "History", LocalDate.now());
        Book book4 = new Book("Author 4", "Title4", 2000, "Horror", LocalDate.now());
        Book book5 = new Book("Author 5", "Title5", 2000, "Horror", LocalDate.now());

        DataManager.addBook(book1);
        DataManager.addBook(book2);
        DataManager.addBook(book3);
        DataManager.addBook(book4);
        DataManager.addBook(book5);

        //Act
        Map<String, Long> stock = DataManager.getStock();

        //Assert
        assertEquals(1l, stock.get("Fiction"));
        assertEquals(3l, stock.get("Horror"));
        assertEquals(1l, stock.get("History"));
        assertEquals(3, stock.size());
    }
}

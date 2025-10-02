package edu.banki.libraryapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class NewBookController {
    @FXML
    private TextField authorField, titleField, yearField;

    @FXML
    private ComboBox<String> categoryBox;

    @FXML
    private DatePicker datePicker;
}
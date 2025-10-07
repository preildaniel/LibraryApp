package edu.banki.libraryapp.controller;

import edu.banki.libraryapp.model.Book;
import edu.banki.libraryapp.model.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class NewBookController implements Initializable {
    @FXML
    private TextField authorField, titleField, yearField;

    @FXML
    private ComboBox<String> categoryBox;

    @FXML
    private DatePicker datePicker;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoryBox.getItems().addAll("szépirodalom", "scifi", "nyelvkönyv", "tudomány");
    }

    @FXML
    public void handleSave(ActionEvent event) {
        //TODO input validation
        try {
            Book book = new Book(authorField.getText(), titleField.getText(), Integer.parseInt(yearField.getText()), categoryBox.getValue(), datePicker.getValue());
            DataManager.addBook(book);
            showAlert("Sikeres mentés");
        } catch (Exception e) {
            showAlert("Hiba! ellenőrizd az adatokat");
        }

    }

    public void goToStock(ActionEvent event) throws IOException {
        Stage stage = (Stage) authorField.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/edu/banki/libraryapp/stock-view.fxml")));
        stage.setScene(scene);
    }

    public void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.showAndWait();
    }
}
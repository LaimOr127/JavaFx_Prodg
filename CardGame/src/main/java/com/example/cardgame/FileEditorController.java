package com.example.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.*;
import java.util.Optional;
import java.util.Scanner;

public class FileEditorController {

    @FXML
    private TextArea textArea;

    private File file = null;

    @FXML
    private void initialize() {
        textArea.setWrapText(true);
        // Дополнительная инициализация, если необходимо
    }

    @FXML
    private void chooseFile(ActionEvent event) {
        // Реализация выбора файла, аналогично предыдущему коду
    }

    @FXML
    private void createFile(ActionEvent event) {
        // Реализация создания файла, аналогично предыдущему коду
    }

    @FXML
    private void deleteFile(ActionEvent event) {
        // Реализация удаления файла, аналогично предыдущему коду
    }

    @FXML
    private void writeFile(ActionEvent event) {
        // Реализация записи в файл, аналогично предыдущему коду
    }

    @FXML
    private void readFile(ActionEvent event) {
        // Реализация чтения из файла, аналогично предыдущему коду
    }

    @FXML
    private void editFile(ActionEvent event) {
        // Реализация редактирования файла, аналогично предыдущему коду
    }

    @FXML
    private void appendToFile(ActionEvent event) {
        // Реализация добавления в файл, аналогично предыдущему коду
    }
}

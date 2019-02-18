package com.geekbrains.cloud.client;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextArea textArea;

    @FXML
    TextField msgField;

    @FXML
    ListView<String> filesList;

    @FXML
    VBox mainBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        filesList.getItems().addAll(new File("1").list());

        File file = new File("1/1.txt");
        System.out.println(new Date( file.lastModified()));

        filesList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2) {
                    System.out.println(filesList.getSelectionModel().getSelectedItem());
                }
            }
        });
    }

    public void sendMsg() {
        textArea.appendText(msgField.getText() + "\n");
        msgField.clear();
        msgField.requestFocus();
        Button btn = new Button("Java");
        btn.setOnAction(event -> System.out.println(123));
        mainBox.getChildren().add(btn);
    }
}

package com.java.assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.IOException;



public class HelloApplication extends Application {

    public boolean example1() {
        return true;
    }

    public boolean emailAddressCheck(String email) {
        if (email.length() < 1) {
            return true;
        }
        return false;
    }

    public boolean passwordCheck(String password) {
        if (password.length() < 7) {
            return true;
        }
        return false;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.java.assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

import java.io.IOException;



public class HelloApplication extends Application {

    public boolean example1() {
        return true;
    }

    public boolean emailAddressCheck(String email) {
        /*
        if (email.length() < 1) {
            return true;
        }
        */
        String emailFormat = "^[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.[0-9a-zA-Z]+$";
        Pattern emailPattern = Pattern.compile(emailFormat);
        if (emailPattern.matcher(email).matches()){
            return false;
        }
        return true;
    }

    public boolean passwordCheck(String password) {

        String SpecialCharList = "*^&@!";
        if (password.length() > 6) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetter(password.charAt(i)))
                    for (int x = 0; x < password.length(); x++) {
                        if (Character.isDigit(password.charAt(x)))
                            for (int y = 0; y < password.length(); y++)
                                for (int z = 0; z < SpecialCharList.length(); z++)
                                    if (SpecialCharList.charAt(z) == password.charAt(y)) {
                                        return false;
                                    }

                    }
            }
        }
        return true;
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
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
        /*
        if (password.length() > 6) {
            for (int i = 0; i < password.length(); i++){
                if (Character.isLetter(password.charAt(i)))
                    return false;
            }
        */
        //}
        //for (int i = 0; i < password.length(); i++){
          //  if (Character.isLetter(password.charAt(i)))
            //    return false;
        //}

        for (int x = 0; x < password.length(); x++){
            if (Character.isDigit(password.charAt(x)))
                return false;
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
package com.java.assignment3;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController{
    @FXML
    private Label welcomeText;

    /*
    @FXML
    Label emailLabel = new Label("Email Address:");
    @FXML
    TextField emailTextField = new TextField();
    @FXML
    Label passwordLabel = new Label("Password:");
    @FXML
    TextField passwordTextField = new TextField();
    @FXML
    Label submitButton = new Label("Submit");
    @FXML
    protected void onSubmitButtonClick() {
        MyApplication myApplication = new MyApplication();
        if (((!myApplication.emailAddressCheck(emailTextField.getText()))) & ((!myApplication.passwordCheck(passwordTextField.getText())))){
            submitButton.setText("Welcome!!");
        } else {
            submitButton.setText("Please enter the required details correctly");
        }
    }


     */

    @FXML
    private Label emailLabel;
    @FXML
    private TextField emailTextField;
    @FXML
    private Label passwordLabel;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label submitButton;
    @FXML
    protected void onSubmitButtonClick() {
        MyApplication myApplication = new MyApplication();
        if (((!myApplication.emailAddressCheck(emailTextField.getText()))) & ((!myApplication.passwordCheck(passwordTextField.getText())))){
            submitButton.setText("Welcome!!");
        } else {
            submitButton.setText("Please enter the required details correctly");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
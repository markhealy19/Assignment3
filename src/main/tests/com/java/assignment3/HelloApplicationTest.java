package com.java.assignment3;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloApplicationTest {

    @Test
    public void testExample1(){
        HelloApplication app = new HelloApplication();
        assertTrue(app.example1());
    }

    @Test
    public void testEmailIsNotNull(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.emailAddressCheck("dferv"));
    }

    @Test
    public void testPasswordLength(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.passwordCheck("adse"));
    }

    @Test
    public void testPasswordLetter(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.passwordCheck("12345Adwa"));
    }

}
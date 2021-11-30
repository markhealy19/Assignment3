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
        assertFalse(app.passwordCheck("adsedsw"));
    }

    @Test
    public void testPasswordLetter(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.passwordCheck("12sqd"));
    }

    @Test
    public void testPasswordDigit(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.passwordCheck("122dfwferf321"));
    }

    @Test
    public void testPasswordSpecialCharacter(){
        HelloApplication app = new HelloApplication();
        assertFalse(app.passwordCheck("122dfwferf321"));
    }

}
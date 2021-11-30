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
    /*
    @Test
    public static boolean testValidEmail(String email) {
        //String emailRegex =
        String emailCheck = "^[0-9A-Za-z_.]" + "[@]" + "[a-zA-Z]" + "[.]" + "[a-zA-Z]$";

        Pattern pat = Pattern.compile(emailCheck);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    */
}
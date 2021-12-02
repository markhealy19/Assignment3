package com.java.assignment3;

import javafx.application.Application;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyApplicationTest {
    private MyApplication app;

    @BeforeEach
    void init(){
        app = new MyApplication();
    }

    @Test
    public void testEmailIsNotNull(){
        assertFalse(app.emailAddressCheck("dferv"));
    }

    @Test
    public void testEmailFormat(){
        assertFalse(app.emailAddressCheck("m@arkdanhealygmail.s"));
    }

    @Test
    public void testPasswordLength(){
        assertFalse(app.passwordCheck("adsedsw"));
    }

    @Test
    public void testPasswordLetter(){
        assertFalse(app.passwordCheck("12sqd"));
    }

    @Test
    public void testPasswordDigit(){
        assertFalse(app.passwordCheck("122dfwferf321*"));
    }

    @Test
    public void testPasswordSpecialCharacter(){
        assertFalse(app.passwordCheck("&tghrf321"));
    }

}
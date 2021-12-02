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
        //MyApplication app = new MyApplication();
        assertFalse(app.emailAddressCheck("dferv"));
    }

    @Test
    public void testEmailFormat(){
        //MyApplication app = new MyApplication();
        assertFalse(app.emailAddressCheck("m@arkdanhealygmail.s"));
    }

    @Test
    public void testPasswordLength(){
        //MyApplication app = new MyApplication();
        assertFalse(app.passwordCheck("adsedsw"));
    }

    @Test
    public void testPasswordLetter(){
        //MyApplication app = new MyApplication();
        assertFalse(app.passwordCheck("12sqd"));
    }

    @Test
    public void testPasswordDigit(){
        //MyApplication app = new MyApplication();
        assertFalse(app.passwordCheck("122dfwferf321*"));
    }

    @Test
    public void testPasswordSpecialCharacter(){
        //MyApplication app = new MyApplication();
        assertFalse(app.passwordCheck("&tghrf321"));
    }

}
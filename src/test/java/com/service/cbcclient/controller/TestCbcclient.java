package com.service.cbcclient.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCbcclient {

        CbcclientDelegate cbcclientDelegate = new CbcclientDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cbcclientDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
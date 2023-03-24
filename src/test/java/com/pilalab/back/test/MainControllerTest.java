package com.pilalab.back.test;

import com.pilalab.back.controller.MainController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainControllerTest {

    private final MainController mainController = new MainController();

    @Test
    void testMainTest() {
        String result = mainController.mainTest();
        System.out.println("test:" + result);
        assertEquals("hello world", result);
    }
}

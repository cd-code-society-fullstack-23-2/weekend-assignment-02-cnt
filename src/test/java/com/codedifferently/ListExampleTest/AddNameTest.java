package com.codedifferently.ListExampleTest;

import com.codedifferently.ListExample.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class AddNameTest {

    @BeforeEach
    void addName(){

    }
    @Test
    public void addNameTest() {
        Main main = new Main();
        main.addName("Jacqueline");
        List<String> name = main.getNames();

        assertEquals(1, name.size());
        assertEquals("Jacqueline", name.get(0));

    }
}

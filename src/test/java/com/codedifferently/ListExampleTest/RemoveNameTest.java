package com.codedifferently.ListExampleTest;

import com.codedifferently.ListExample.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveNameTest {
    @Test
    public void removeNameTest() {
        Main main = new Main();
        main.addName("Jacqueline");
        main.getNames().remove(0);
        List<String> name = main.getNames();

        assertEquals(0, name.size());


    }
}

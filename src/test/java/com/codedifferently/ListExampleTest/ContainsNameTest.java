package com.codedifferently.ListExampleTest;

import com.codedifferently.ListExample.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsNameTest {
    @Test
    public void containsNameTest() {
        Main main = new Main();
        main.addName("Jacqueline");
        main.addName("Candice");
        List<String> names = main.getNames();

        assertTrue(names.contains("Jacqueline"));
        assertFalse(names.contains("Candice"));

    }
}

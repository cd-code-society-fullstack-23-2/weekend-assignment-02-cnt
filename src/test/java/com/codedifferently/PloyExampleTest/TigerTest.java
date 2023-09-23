package com.codedifferently.PloyExampleTest;

import com.codedifferently.PolyExample.Tiger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TigerTest {

    private final Tiger tiger = new Tiger();

    @Test
    public void testGetBreed(){
        tiger.setBreed("Cat");
        Assertions.assertEquals("Cat",tiger.getBreed());

    }

}

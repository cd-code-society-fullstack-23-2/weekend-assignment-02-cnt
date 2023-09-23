package com.codedifferently.PloyExampleTest;

import com.codedifferently.PolyExample.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LionTest {

    private final Lion lion = new Lion();


    @Test
    public void testGetBreed(){
        lion.setPreyPreference("Zebra");
        Assertions.assertEquals("Zebra",lion.getPreyPreference());
    }
}

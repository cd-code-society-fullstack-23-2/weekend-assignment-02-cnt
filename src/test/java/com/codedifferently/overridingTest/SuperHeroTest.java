package com.codedifferently.overridingTest;

import com.codedifferently.overridingExample.SuperHero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SuperHeroTest {
    private SuperHero superHero;
    @BeforeEach
    public void setUp(){superHero = new SuperHero("Wolverine","Regeneration");}

    @Test
    public void getNameTest01(){
        String expected = "Wolverine";
        String actual = superHero.getName();

        Assertions.assertEquals(expected, actual);
    }
}

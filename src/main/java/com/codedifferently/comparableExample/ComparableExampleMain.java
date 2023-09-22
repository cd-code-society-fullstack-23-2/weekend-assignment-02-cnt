package com.codedifferently.comparableExample;

import com.codedifferently.comparableExample.spice.HeatLevel;
import com.codedifferently.comparableExample.spice.Spice;
import com.codedifferently.comparableExample.spice.SpiceGrade;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExampleMain {
    public static void main(String[] args) {
        ArrayList<Spice> spiceGals = new ArrayList<>();
        Spice cayenne = new Spice("Cayeene", "Orange", HeatLevel.HOT, SpiceGrade.POWDER);
        Spice pumpkin = new Spice();
        Spice pimento = new Spice("Pimento", "brown", HeatLevel.MILD, SpiceGrade.GROUNDED);
        spiceGals.add(cayenne);
        spiceGals.add(pumpkin);
        spiceGals.add(pimento);

        Collections.sort(spiceGals);
        for (Spice spice: spiceGals
        ) {
            System.out.println(spice);
        }
    }
}

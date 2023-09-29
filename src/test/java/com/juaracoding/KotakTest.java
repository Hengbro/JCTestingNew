package com.juaracoding;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KotakTest {
    Kotak kotak = new Kotak();
    @Test
    public void testLuasKotak(){
        assertEquals(kotak.luas(5), 25);
    }
    @Test
    public void testVolumeLuasKotak(){
        assertEquals(kotak.volume(5), 25);
    }
}

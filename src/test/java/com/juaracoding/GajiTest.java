package com.juaracoding;

import org.junit.Assert;
import org.junit.Test;

public class GajiTest {
    Gaji gaji = new Gaji();
    @Test
    public void testDapatPajak(){
        Assert.assertEquals(gaji.gajiBersih(800),"Dapat Pajak");
    }
    @Test
    public void testTidakPajak(){

        Assert.assertEquals(gaji.gajiBersih(500),"Tidak dapat Pajak");
    }
}

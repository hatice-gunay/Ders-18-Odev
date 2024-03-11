package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class calisanTestdataProvider {

    @Test(dataProvider = "calisanData")
    public void testCalculatePrim(calisan personel, boolean beklenenSonuc) {
        boolean gercekSonuc = personel.gelinenGun > 25;
        assertEquals(gercekSonuc, beklenenSonuc);
    }

    @DataProvider(name = "calisanData")
    public Object[][] calisanData() {
        return new Object[][]{
                {createCalisan("Mehmet", "Yılmaz", 26), true},  // 26 gün, prim alınabilir
                {createCalisan("Ayse", "Kaya", 27), true},      // 27 gün, prim alınabilir
                {createCalisan("Sevgi", "Demir", 23), false},   // 23 gün, prim alınamaz
                {createCalisan("Ali", "Şahin", 29), true}       // 29 gün, prim alınabilir
        };
    }

    private calisan createCalisan(String ad, String soyad, int gelinenGun) {
        calisan personel = new calisan();
        personel.ad = ad;
        personel.soyad = soyad;
        personel.gelinenGun = gelinenGun;
        return personel;
    }
}
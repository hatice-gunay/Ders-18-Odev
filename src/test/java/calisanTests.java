package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class calisanTests {

    @Test
    public void testkisiAdSoyad() {
        calisan personel = new calisan();
        personel.ad = "Mehmet";
        personel.soyad = "Yılmaz";
        personel.kisiAdSoyad();
    }

    @Test
    public void testcalculatePrim() {
        calisan personel1 = new calisan();
        personel1.ad = "Mehmet";
        personel1.soyad = "Yılmaz";
        personel1.gelinenGun = 26;
        personel1.calculatePrim();

        calisan personel2 = new calisan();
        personel2.ad = "Ayse";
        personel2.soyad = "Kaya";
        personel2.gelinenGun = 27;
        personel2.calculatePrim();

        calisan personel3 = new calisan();
        personel3.ad = "Sevgi";
        personel3.soyad = "Demir";
        personel3.gelinenGun = 23;
        personel3.calculatePrim();

        calisan personel4 = new calisan();
        personel4.ad = "Ali";
        personel4.soyad = "Şahin";
        personel4.gelinenGun = 29;
        personel4.calculatePrim();
    }
}
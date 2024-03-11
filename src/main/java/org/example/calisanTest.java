package org.example;


public class calisanTest {
    public static void main(String[] args) {

        calisan personel1 = new calisan();
        calisan personel2 = new calisan();
        calisan personel3 = new calisan();
        calisan personel4 = new calisan();

        personel1.ad = "Mehmet";
        personel1.soyad = "Yılmaz";
        personel1.gelinenGun = 26;

        personel2.ad = "Ayse";
        personel2.soyad = "Kaya";
        personel2.gelinenGun = 27;

        personel3.ad = "Sevgi";
        personel3.soyad = "Demir";
        personel3.gelinenGun = 23;

        personel4.ad = "Ali";
        personel4.soyad = "Şahin";
        personel4.gelinenGun = 29;

        personel1.kisiAdSoyad();
        personel2.kisiAdSoyad();
        personel3.kisiAdSoyad();
        personel4.kisiAdSoyad();
        personel1.calculatePrim();
        personel2.calculatePrim();
        personel3.calculatePrim();
        personel4.calculatePrim();

    }


}
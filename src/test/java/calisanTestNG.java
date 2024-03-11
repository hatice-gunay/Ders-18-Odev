package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class calisanTestNG {

    @Test
    public void testCalisanPrim() {
        calisan personel1 = new calisan();
        personel1.ad = "Mehmet";
        personel1.soyad = "Yılmaz";
        personel1.gelinenGun = 26;
        Assert.assertEquals(personel1.calculatePrim(), "Mehmet Yılmaz isimli kişi 26 gün şirkete geldiği için toplam 1000 TL kadar prim almayı hak etmiştir.");

        calisan personel2 = new calisan();
        personel2.ad = "Ayse";
        personel2.soyad = "Kaya";
        personel2.gelinenGun = 27;
        Assert.assertEquals(personel2.calculatePrim(), "Ayse Kaya isimli kişi 27 gün şirkete geldiği için toplam 2000 TL kadar prim almayı hak etmiştir.");

        calisan personel3 = new calisan();
        personel3.ad = "Sevgi";
        personel3.soyad = "Demir";
        personel3.gelinenGun = 23;
        Assert.assertEquals(personel3.calculatePrim(), "Sevgi Demir isimli kişi 23 gün şirkete geldiği için prim almaya hak kazanmamıştır.");

        calisan personel4 = new calisan();
        personel4.ad = "Ali";
        personel4.soyad = "Şahin";
        personel4.gelinenGun = 29;
        Assert.assertEquals(personel4.calculatePrim(), "Ali Şahin isimli kişi 29 gün şirkete geldiği için toplam 4000 TL kadar prim almayı hak etmiştir.");
    }
}
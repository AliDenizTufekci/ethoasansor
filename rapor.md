# Rapor

**Ad Soyad:Ali Deniz Tüfekci**
**Numara:722**

## 1. Problemin Açıklaması
<!--Bir binadaki asansörün yönetim mekanizması , asansörün 1'den 10'a kadar olan katlarda hem aşağı hem yukarı yönlü olarak yolcu taşıyabilmesini sağlamalıdır. Bunun için önce mevcut kat verisi alıp , sonra hedef kat verisi alıp , sonra gitmesi gereken yönü ve mesafeyi hesaplayıp bunları ve her defasında geçilen katları tek tek sorunsuz bir şekilde çıktı vermelidir. Ayrıca girilen kat değerlerinden herhangi biri 1'den küçük ya da 10'dan büyük ise hata verip bitirmelidir. Problemi kendi cümlelerinizle yazın. -->


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-TEST=girdi kat1:2  girdi kat 2:8 

**İşlemler:**
- TEST=ilk girdi olan mevcut kat ve 2. girdi olan hedef kat verileri alınır ve uygunlukları test edilir. Uygun oldukları görülen verilerden hangisinin büyük olduğuna bakılır. kat 2 verisi (yani 8) daha büyük olduğu için hareket mesafesi kat 2-kat 1 olacak şekilde hesaplanır ve ekrana uygun çıktı (çıktılar,test,çıktı1 kısmında görüleceği gibi) verilir. Sonrasında ise uygun şekilde hazırlanmış "for" döngüsü kullanılarak her kattan geçerken o kattan geçildiği sırayla belirtilir.

**Çıktılar:**
-TEST-ÇIKTI1:"Tebrikler! Asansör, bulunduğunuz 2 katından 8 katına doğru 6 tane katı(kat boslugunu ) geçecek sekilde yukari yonlu olarak hareket etmektedir. BİNİNİZ." yazısı çıktı verilir.
-TEST-ÇIKTI2:"geçilen kat 2 katıdır." , "geçilen kat 3 katıdır." , "geçilen kat 4 katıdır." , "geçilen kat 5 katıdır." , "geçilen kat 6 katıdır." , "geçilen kat 7 katıdır." ,"geçilen kat 8 katıdır." 
## 3. Sözde Kod (Pseudocode)

```
1.output:"Merhaba!Bulunduğunuz katı giriniz."
2.input:kat1 tam sayı tanımla
3.if (kat1>=1 ve kat1<=10) ,4'ten devam et, else ise 16'dan devam et.
4.output:"Tebrikler!Şimdi,gitmek istediğiniz katı giriniz."
5.input :kat2 tam sayı tanımla
6.if (kat2>=1 ve kat2<=10) ,7'den devam et , else ise 15'ten devam et.
7.if (kat1>kat2),8'den devam et , else if (kat2>kat1) 11'den devam et , else ise 14'den devam et.
8.harmes tam sayı tanımla : kat1- kat2
9.output : "Tebrikler!Asansör,bulunduğumuz" + kat1 + "katından" + kat2 + "katına doğru" + harmes + "tane katı(kat boslugunu) geçecek sekilde asagi yonlu olarak hareket etmektedir.BİNİNİZ."
10.for ( tanımla tam sayı i; i>=kat2;i--) { output:"gecilen kat" + i + "katidir."},bitir.
11.harnes tam sayı tanımla : kat2-kat1
12.Output : "Tebrikler!Asansör,bulunduğumuz" + kat1 + "katından" + kat2 + "katına doğru" + harmes + "tane katı(kat boslugunu) geçecek sekilde yukari yonlu olarak hareket etmektedir.BİNİNİZ."
13.for ( tanımla tam sayı i; i<=kat2;i++) { output : "gecilen kat" + i + "katidir."},bitir.
14.Output "girdiginiz katlar aynı katlardır.Bu sebeple beni kullanamazsınız,ZATEN HEDEF KATINIZDASINIZ.",bitir.
15.output:"her ne kadar girdiginiz " + kat1 + "kati mevcut ve uygun olsa da girdiginiz " + kat2 + "katı (hedef kat) asansörün gidebileceği katlar arasında değildir.",bitir.
16.Output:"asansorun gidebilecegi katlar arasinda boyle bir kat yoktir,baska bir vasita araci bulunuz"

```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı |"Tebrikler!Asansör,bulunduğumuz 3 katından 8 katına doğru 5 tane katı(kat boslugunu) geçecek sekilde yukari yonlu olarak hareket etmektedir.BİNİNİZ." |evet|
| 9 | 2 | 7 kat aşağı | "Tebrikler!Asansör,bulunduğumuz 9 katından 2 katına doğru 7 tane katı(kat boslugunu) geçecek sekilde asagi yonlu olarak hareket etmektedir.BİNİNİZ."|evet |
| 5 | 5 | Hareket yok | girdiginiz katlar aynı katlardır.Bu sebeple beni kullanamazsınız,ZATEN HEDEF KATINIZDASINIZ."|evet |
| 1 | 10 | 9 kat yukarı |"Tebrikler!Asansör,bulunduğumuz 1 katından 10  katına doğru 9 tane katı(kat boslugunu) geçecek sekilde yukari yonlu olarak hareket etmektedir.BİNİNİZ."  |evet |
| 10 | 1 | 9 kat aşağı |"Tebrikler!Asansör,bulunduğumuz 9 katından 2 katına doğru 7 tane katı(kat boslugunu) geçecek sekilde asagi yonlu olarak hareket etmektedir.BİNİNİZ."|evet |
| 0 | 5 | Geçersiz mevcut kat |"asansorun gidebilecegi katlar arasinda boyle bir kat yoktir,baska bir vasita araci bulunuz."|evet |
| 5 | 11 | Geçersiz hedef kat |"her ne kadar girdiginiz 5 kati mevcut ve uygun olsa da girdiginiz 11 katı (hedef kat) asansörün gidebileceği katlar arasında değildir." | evet|
| -2 | 4 | Geçersiz mevcut kat |"asansorun gidebilecegi katlar arasinda boyle bir kat yoktir,baska bir vasita araci bulunuz." |evet |

## 6. Ekstra Görev (Opsiyonel)
<--!output-geçilen katların sırayla eş zamanlı yazımı:gecilen kat3katidir.gecilen kat4katidir.gecilen kat5katidir.gecilen kat6katidir.gecilen kat7katidir.gecilen kat8katidir. 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

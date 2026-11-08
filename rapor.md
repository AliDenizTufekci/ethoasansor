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
2.input:kat1
3.if (kat1>=
4
5
6
7
8
9
10
11





























```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | | |
| 9 | 2 | 7 kat aşağı | | |
| 5 | 5 | Hareket yok | | |
| 1 | 10 | 9 kat yukarı | | |
| 10 | 1 | 9 kat aşağı | | |
| 0 | 5 | Geçersiz mevcut kat | | |
| 5 | 11 | Geçersiz hedef kat | | |
| -2 | 4 | Geçersiz mevcut kat | | |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

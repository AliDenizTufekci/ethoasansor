# Ödev: Asansör Karar Algoritması

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

## Repo Yapısı

```
.
├── README.md        -> Ödev tanımı (bu dosya)
├── RAPOR.md         -> Doldurmanız gereken rapor
├── src/
│   └── Main.java    -> Java çözümünüzü buraya yazın
└── docs/
    └── akis-semasi.png  -> Çizdiğiniz akış şemasını buraya koyun
```

## Nasıl Çalıştırılır?

```bash
javac src/Main.java
java -cp src Main
```

## Problem

10 katlı bir binadaki asansör, kullanıcının seçtiği kata gitmelidir. Asansörün mevcut katı ve kullanıcının gitmek istediği kat bilinmektedir. Algoritmanız bu iki bilgiye bakarak asansörün hangi yöne gideceğine karar vermelidir.

## Gereksinimler

1. **Girdi:** Kullanıcıdan mevcut kat (1–10) ve hedef kat (1–10) alınır.
2. **Girdi kontrolü:**
   - Kat 1 ile 10 arasında olmalıdır (0, negatif ve 10'dan büyük sayılar geçersizdir).
   - Geçersiz girişte hata mesajı gösterilir ve hareket kararı **verilmez**.
3. **Hareket kararı:**

   | Durum | Karar |
   |---|---|
   | Hedef > mevcut | Yukarı çık |
   | Hedef < mevcut | Aşağı in |
   | Hedef = mevcut | Hareket etme |

4. **Hareket mesafesi:** Asansörün kaç kat gideceği hesaplanır.
5. **Çıktı:** Mevcut kat, hedef kat, yön, mesafe ve işlem sonucu ekrana yazılır.

## Örnek Test Senaryoları

| Mevcut kat | Hedef kat | Beklenen sonuç |
|---|---|---|
| 3 | 8 | 5 kat yukarı |
| 9 | 2 | 7 kat aşağı |
| 5 | 5 | Hareket yok |
| 1 | 10 | 9 kat yukarı |
| 10 | 1 | 9 kat aşağı |
| 0 | 5 | Geçersiz mevcut kat |
| 5 | 11 | Geçersiz hedef kat |
| -2 | 4 | Geçersiz mevcut kat |

## Sizden İstenenler

1. Problemi kendi cümlelerinizle açıklayın. (`RAPOR.md`)
2. Girdileri, işlemleri ve çıktıları belirleyin. (`RAPOR.md`)
3. Çözümü adım adım sözde kod (pseudocode) olarak yazın. (`RAPOR.md`)
4. Akış şemasını çizin. (`docs/akis-semasi.png`)
5. Java kodunu yazın. (`src/Main.java`)
6. Tüm test senaryolarını deneyin ve sonuçları yazın. (`RAPOR.md`)

## Ekstra Görev (Opsiyonel)

Mevcut kat 3, hedef kat 8 iken asansörün geçtiği tüm katları sırasıyla ekrana yazdırın (3 → 4 → 5 → 6 → 7 → 8).

## Teslim

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.

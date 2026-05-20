# AI LOG — PHASE 1

## Kullanılan AI Aracı

Bu fazda ChatGPT ve Claude AI araçlarından destek aldım.

---

## AI'a Sorduğum Sorular

### Soru 1
Factory Pattern nedir ve bu projede nasıl uygulanabilir?

### AI Yanıtı Özeti
AI, Factory Pattern’in nesne oluşturma işlemlerini merkezi bir sınıfta topladığını ve doğrulama işlemlerinin burada yapılmasının daha doğru olduğunu açıkladı.

---

### Soru 2
Ürün doğrulama işlemleri hangi sınıfta yapılmalı?

### AI Yanıtı Özeti
AI, doğrulama işlemlerinin Sepet sınıfında değil, UrunFactory içinde yapılmasının daha temiz bir mimari oluşturacağını söyledi.

---

### Soru 3
Factory Pattern bu projeye ne kazandırır?

### AI Yanıtı Özeti

AI şu avantajları belirtti:

- Kod tekrarını azaltır
- Ürün oluşturmayı standart hale getirir
- Hatalı veri girişini engeller
- Sepet sınıfının sorumluluğunu azaltır
- Genişletilebilirliği artırır

---

## AI Önerilerini Nasıl Kullandım

AI’ın önerileri doğrultusunda:

- `Urun` sınıfı oluşturdum
- `UrunFactory` sınıfı oluşturdum
- Ürün doğrulamalarını factory içine taşıdım
- Sepet sınıfını sadeleştirdim

---

## Kendi Öğrendiklerim

Bu fazda Factory Pattern’in sadece nesne üretmek için değil,
kod düzenini korumak için de önemli olduğunu öğrendim.

Önceden ürün oluşturmayı doğrudan Sepet içinde yapıyordum.
Factory kullandıktan sonra sorumlulukların ayrılması daha net hale geldi.

---

## Sonuç

AI desteği sayesinde Factory Pattern mantığını daha iyi anladım ve projeye doğru şekilde uyguladım.
Bu faz sonunda kod daha düzenli, okunabilir ve geliştirilebilir hale geldi.

# AI LOG — PHASE 2

## Kullanılan AI Aracı

Bu fazda ChatGPT ve Claude AI araçlarından destek aldım.

---

## AI'a Sorduğum Sorular

### Soru 1
Decorator Pattern nedir ve ne işe yarar?

### AI Yanıtı Özeti

AI, Decorator Pattern’in mevcut bir nesnenin yapısını bozmadan ona yeni özellikler eklemek için kullanıldığını açıkladı.

Bu yapının kalıtımdan daha esnek olduğu belirtildi.

---

### Soru 2
Bu projede Decorator Pattern nasıl uygulanabilir?

### AI Yanıtı Özeti

AI, Sepet sınıfına doğrudan yeni alanlar eklemek yerine dekoratör sınıfları kullanarak ek özelliklerin sonradan eklenebileceğini söyledi.

Örnek olarak:

- Kargo ücreti ekleme
- Hediye paketi ekleme
- Kampanya servisleri ekleme

önerildi.

---

### Soru 3
Decorator neden normal if-else kullanımından daha iyi?

### AI Yanıtı Özeti

AI şu avantajları belirtti:

- Mevcut sınıf değiştirilmez
- Yeni özellik eklemek kolaylaşır
- Kod tekrarını azaltır
- Daha modüler yapı sağlar
- Açık/Kapalı Prensibine uygundur

---

## AI Önerilerini Nasıl Kullandım

AI yönlendirmesiyle:

- `SepetDecorator` sınıfı oluşturdum
- `KargoDecorator` ekledim
- `HediyePaketiDecorator` ekledim

Bu sınıflar sayesinde sepete sonradan ek ücretler eklenebilir hale geldi.

---

## Karşılaştığım Sorunlar

Başta dekoratör sınıflarını yanlış bağladım ve constructor hataları aldım.

AI bunun sebebinin decorator zincirinin yanlış kurulması olduğunu açıkladı.

Bu açıklama sayesinde yapıyı düzelttim.

---

## Kendi Öğrendiklerim

Bu fazda Decorator Pattern’in mevcut sistemi bozmadan yeni özellik eklemek için çok güçlü bir yöntem olduğunu öğrendim.

Başta mantığını karıştırdım ama örnekler üzerinde ilerledikçe daha net anladım.

Özellikle kargo ve hediye paketi örneği bu mantığı anlamamı kolaylaştırdı.

---

## Sonuç

AI desteği Decorator Pattern’i anlamamı hızlandırdı.

Bu faz sonunda proje daha esnek hale geldi ve yeni ek servisleri sisteme eklemek kolaylaştı.

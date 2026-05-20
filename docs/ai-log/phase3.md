# AI LOG — PHASE 3

## Kullanılan AI Aracı

Bu fazda ChatGPT ve Claude AI araçlarından yararlandım.  
Ancak bu aşamada AI’dan doğrudan kod almak yerine, kendi kurduğum sistemi nasıl daha esnek ve profesyonel hale getirebileceğim üzerine fikir almak istedim.

Asıl hedefim indirim ve ödeme sistemini kullanıcı seçimlerine göre değiştirebilen daha dinamik bir yapı kurmaktı.

---

## Bu Fazdaki Kendi Hedefim

Projeyi geliştirirken şunu fark ettim:

Başlangıçta indirim ve ödeme işlemleri sabit kurallarla ilerliyordu.  
Yeni bir indirim türü eklemek veya ödeme mantığını değiştirmek için ana kodu değiştirmek gerekiyordu.

Ben bunu daha modüler hale getirmek istedim.

Amacım:

- Kullanıcı seçimlerine göre farklı indirimler uygulamak
- Farklı ödeme yöntemleri eklemek
- Ana Sepet sınıfını bozmadan sistemi büyütebilmek
- Gerçek e-ticaret mantığına daha yakın bir yapı kurmak

---

## AI’a Sorduğum Sorular

### Soru 1

Bu sistemi if-else yapısından kurtarıp daha profesyonel nasıl kurabilirim?

### AI Yanıtı Özeti

AI, Strategy Pattern kullanarak her indirim ve ödeme türünü ayrı sınıflara ayırmamı önerdi.

Bu yaklaşımın kodu daha okunabilir ve geliştirilebilir yapacağı açıklandı.

---

### Soru 2

Ödeme ve indirim stratejileri kullanıcı seçimine göre nasıl bağlanmalı?

### AI Yanıtı Özeti

AI, kullanıcıdan alınan seçimin ilgili strategy sınıfına bağlanmasını önerdi.

Böylece ana sistem sabit kalırken davranışlar dışarıdan değiştirilebilir hale geliyor.

---

## AI Önerilerini Nasıl Geliştirdim

AI temel mantığı anlattı ama sistemi ben genişlettim.

Projeye şunları ekledim:

### İndirim Stratejileri

- %10 indirim
- %20 indirim
- Öğrenci indirimi

---

### Ödeme Stratejileri

- Kredi kartı
- Havale (%5 ek indirim)
- Taksitli ödeme (%5 fark)

---

### Kullanıcı Etkileşimi

Kullanıcının seçim yapmasını sağlayan doğrulamalı menüler ekledim.

Hatalı giriş yapıldığında sistem tekrar seçim istiyor.

Bu kısmı özellikle kendim geliştirerek daha güvenli hale getirdim.

---

## Karşılaştığım Problemler

Bu fazda en çok interface isimlendirmeleri ve method eşleşmelerinde hata aldım.

Örneğin:

- Method isimlerinin büyük/küçük harf uyuşmazlığı
- Override hataları
- Interface implement ederken eksik method yazımı

AI bu hataların nedenini açıkladı, çözümü uygulayıp sistemi düzelttim.

Bu süreç Strategy Pattern mantığını daha iyi anlamamı sağladı.

---

## Bu Fazda Öğrendiklerim

Bu aşamada Strategy Pattern’in sadece kodu bölmek değil, davranışı çalışma anında değiştirmek olduğunu öğrendim.

Bu yaklaşım sayesinde sistem:

- daha esnek
- daha temiz
- daha profesyonel

hale geldi.

Özellikle ödeme ve indirimleri sonradan kolayca ekleyebilmek benim için önemli bir kazanım oldu.

---

## Sonuç

Bu fazda AI araçlarından destek aldım fakat sistemi doğrudan kopyalayarak ilerlemedim.

Önce mantığı kendim kurmaya çalıştım, takıldığım noktalarda AI’dan açıklama ve yönlendirme aldım.  
Özellikle Strategy Pattern’in çalışma mantığını anlamamda AI büyük hız kazandırdı.

AI olmasaydı da bu sistemi kurabilirdim, ancak kavramları araştırmak, hataların nedenini bulmak ve doğru mimariyi oturtmak çok daha fazla zamanımı alırdı.

AI bana hazır cevap vermekten çok, düşünme sürecimi hızlandıran bir rehber gibi yardımcı oldu.

Asıl kazanımım kodu çalıştırmak değil, neden bu yapıyı kurduğumu anlayarak ilerlemek oldu.

Bu faz sonunda kullanıcı kararlarına göre davranış değiştirebilen, daha profesyonel ve geliştirilebilir bir sistem kurmuş oldum.

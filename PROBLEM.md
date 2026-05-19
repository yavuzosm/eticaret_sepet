## Benim Tespit Ettiğim Sorunlar

### Problem 1 — Veri Tutarlılığı Riski
Ürün adı, fiyatı ve adedi ayrı yapılarda tutuluyordu (ayrı listeler veya diziler).  
Bu yaklaşım başta işe yarıyor gibi görünse de ilerleyen süreçte bir ürünün fiyatı
yanlış indeksle eşleşebilir. Böyle bir hata oluştuğunda bulmak çok zor olurdu.  
**Neden sorun?** Veriler birbirine bağlı olduğu hâlde ayrı tutulmak, tutarsızlığa davetiye çıkarır.

---

### Problem 2 — Okunması Zor Veri Yapısı
Fiyat ve adet `double[]` gibi diziler içinde saklanıyordu.  
`dizi[0]` fiyat mı, adet mi? Kodu yazan kişi bile bir süre sonra karıştırabilir.  
**Neden sorun?** Kodun okunabilirliği düşer; bakımı zorlaşır.

---

### Problem 3 — İndirim Hesaplaması Sepet Sınıfının İçinde
İndirim mantığı doğrudan `Sepet` sınıfına gömülüydü.  
`Sepet`in asıl görevi ürünleri tutmak olmalı. İndirim işini de üstlenmesi
sınıfı şişiriyor ve tek sorumluluk prensibini (SRP) ihlal ediyor.  
**Neden sorun?** Yeni bir indirim kuralı eklemek için `Sepet` sınıfını değiştirmek gerekir — bu kırılgan bir yapıdır.

---

### Problem 4 — Aşırı if-else Kullanımı
İndirim ve ödeme seçimleri için uzun `if-else` zincirleri kullanılıyordu.  
Şu an az seçenek olduğu için yönetilebilir görünüyor ama her yeni kampanya
veya ödeme yöntemi bu blokları büyütecek.  
**Neden sorun?** Açık/Kapalı Prensibini (OCP) ihlal eder: yeni özellik eklemek için
mevcut kodu değiştirmek zorunda kalırsın.

---

### Problem 5 — Tek Sınıf Çok İş Yapıyor
`Sepet` sınıfı hem ürün ekliyor, hem hesaplama yapıyor, hem de ekrana yazdırıyor.  
Bu kadar farklı sorumluluğun tek sınıfa yüklenmesi "God Class" sorununa yol açar.  
**Neden sorun?** İleride yazdırma formatını değiştirmek istersen hesaplama koduna
da dokunmak zorunda kalırsın — bağımlılık zinciri kırılgan hâle gelir.

---

## AI (Claude) Karşılaştırması

> *Kodu Claude'a gösterdim ve "Bu kodda hangi tasarım sorunlarını görüyorsun?" diye sordum.*

### AI'ın Tespit Ettikleri

| # | AI'ın Gördüğü Sorun |
|---|---|
| 1 | `urunler` listesi boşken toplam hesabı yapılıyor — savunmacı programlama eksik |
| 2 | `sepetGoster()` hem hesaplama hem yazdırma yapıyor — SRP ihlali |
| 3 | İndirim ve ödeme stratejileri sabit sıraya bağımlı (önce indirim, sonra ödeme) — bu sıra belgelenmemiş, değişirse sonuç farklı çıkar |

### Karşılaştırma

| Sorun | Ben Gördüm | AI Gördü |
|---|:---:|:---:|
| Veri dağınıklığı (ayrı listeler) | ✅ | ➖ |
| Okunması zor dizi yapısı | ✅ | ➖ |
| İndirim Sepet'e gömülü (SRP) | ✅ | ✅ |
| if-else zincirleri (OCP) | ✅ | ➖ |
| God Class / çok sorumluluk | ✅ | ✅ |
| Strateji uygulama sırası belirsizliği | ➖ | ✅ |

### Değerlendirmem

Benim tespitlerim daha çok **mimari ve tasarım** açısındandı:
veri tutarlılığı, sorumluluk dağılımı ve genişletilebilirlik.

AI ise daha çok **kod güvenliği ve mimari detay** açısından baktı:
boş liste kontrolü, sorumluluk ihlali ve strateji uygulama sırası gibi
konuları ben atlamıştım.

İkisini birleştirince daha eksiksiz bir analiz ortaya çıktı.
Sonraki fazlarda hem mimari sorunları hem teknik detayları göz önünde bulundurarak ilerlemeyi planlıyorum.

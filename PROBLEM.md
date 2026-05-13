# Faz 0 - Başlangıçta Fark Ettiğim Problemler

## Problem 1
Ürün adı ayrı listede, fiyat ve adet ayrı listede tutuluyor.

Bence bu çok mantıklı değil çünkü ileride veriler karışabilir. 
Bir ürünün fiyatı yanlış ürünle eşleşirse bulması zor olur.

---

## Problem 2
Fiyat ve adet double[] içinde tutulmuş.

Bu ilk başta kısa görünüyor ama okunması zor.
Mesela [0] fiyat mıydı adet miydi karıştırılabiliyor.

---

## Problem 3
İndirim hesaplamaları direkt Sepet sınıfının içinde.

Sepet aslında sadece ürünleri tutmalı.
İndirim işi ayrı olursa kod daha düzenli olurdu.

---

## Problem 4
Çok fazla if-else kullanılmış.

Şu an az olduğu için sorun yok gibi duruyor ama
yeni kampanyalar eklenirse kod büyüyüp karışacak.

---

## Problem 5
Sepet hem hesap yapıyor hem ekrana yazdırıyor.

Tek bir sınıfın bu kadar farklı işi yapması bence iyi değil.
İleride değiştirmek zor olabilir.

---

## Kendi Değerlendirmem

Kodu yazınca çalıştı ama yapının çok düzenli olmadığını fark ettim.
Başta hızlı çözmek için böyle yaptım ama büyürse yönetmesi zorlaşır.

Bu yüzden sonraki fazlarda kodu parçalara ayırıp
daha temiz hale getirmeyi düşünüyorum.

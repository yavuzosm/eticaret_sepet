# PATTERNS.md - Kullandığım Tasarım Örüntüleri

## Faz 1 - Factory Pattern
**Ne yaptım:** UrunFactory sınıfı oluşturdum.
**Neden kullandım:** Ürün oluşturma işini tek bir yere topladım. 
Artık sepet sınıfı "new urun()" demek zorunda değil, fabrikaya soruyor.
**Avantajı:** Yeni ürün tipi eklemek istersen sadece factory'yi değiştirirsin.

## Faz 2 - Decorator Pattern
**Ne yaptım:** KargoDecorator ve HediyePaketiDecorator sınıfları oluşturdum.
**Neden kullandım:** Sepete kargo ve hediye paketi eklemek istedim ama 
sepet.java'ya dokunmak istemedim.
**Avantajı:** Yeni özellik eklemek için mevcut kodu değiştirmiyorsun, 
üstüne yeni bir katman ekliyorsun.

## Faz 3 - Strategy Pattern
**Ne yaptım:** IndirimStrategy ve OdemeStrategy interface'leri oluşturdum.
**Neden kullandım:** İndirim ve ödeme yöntemlerini ayrı sınıflara taşıdım.
Kullanıcı hangi indirimi ve ödeme yöntemini istediğini seçebiliyor.
**Avantajı:** Yeni indirim eklemek için sepet.java'ya dokunmuyorsun,
sadece yeni bir sınıf yazıyorsun.

## Faz 3 - Observer Pattern
**Ne yaptım:** SepetObserver interface'i ve KonsolObserver sınıfı oluşturdum.
**Neden kullandım:** Sepette bir şey değişince bildirim gelmesini istedim.
**Avantajı:** Yeni bildirim tipi eklemek için yeni bir Observer sınıfı yazman yeterli.

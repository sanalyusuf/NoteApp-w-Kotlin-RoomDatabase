# NoteApp - Kotlin ile Not Alma Uygulaması (Room Veritabanı Kullanılarak)

Bu proje, Android platformu için Kotlin programlama dili kullanılarak geliştirilmiş basit bir not alma uygulamasıdır. Veri depolama çözümü olarak Android Room Persistence Library kullanılmıştır.

## Özellikler

* **Not Oluşturma:** Yeni notlar ekleyebilirsiniz.
* **Notları Listeleme:** Kaydettiğiniz tüm notları listeleyebilirsiniz.
* **Not Detaylarını Görüntüleme:** Notun içeriğini detaylı olarak görebilirsiniz.
* **Not Düzenleme:** Mevcut notların içeriğini düzenleyebilirsiniz.
* **Not Silme:** İstemediğiniz notları silebilirsiniz.
* **Yerel Veritabanı:** Notlar, Room Persistence Library kullanılarak cihazın yerel veritabanında saklanır.

## Kullanılan Teknolojiler

* **Kotlin:** Android uygulama geliştirme için kullanılan modern ve özlü programlama dili.
* **Android Jetpack:** Modern Android geliştirmeyi kolaylaştırmak için bir dizi kitaplık, araç ve mimari rehber.
* **Room Persistence Library:** SQLite veritabanı üzerinde soyutlama katmanı sağlayan, veri erişimini kolaylaştıran ve boilerplate kodu azaltan bir Android Jetpack bileşenidir.
* **Coroutines:** Asenkron işlemleri yönetmek için kullanılan Kotlin eşzamanlılık çerçevesi.
* **ViewModel:** UI ile ilgili verileri yaşam döngüsüne duyarlı bir şekilde yönetmek için kullanılan bir Android Jetpack bileşenidir.
* **LiveData:** Gözlemlenebilir veri tutucu sınıfı.

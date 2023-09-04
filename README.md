
Hazırlayan: Fatih Safa Özgür


# DataBase Uygulaması

## Giriş

Proje kapsamında; MsSQL kullanan, giriş yaptıktan sonra tabloları ve sütunları otomatik olarak veri tabanından çeken ve seçim yapılabilmesini sağlayan, böylece içeriği (tablolar ve kolonlar) hiç bilinmeyen bir veritabanına giriş yapıldığı zaman tüm içeriğini bize otomatik olarak getiren ve istenilen veriyi güncelleme imkanı veren, haliyle Universal olarak çalışabilen bir veritabanı uygulaması, Java programlama dili ile gerçekleştirilmiştir. (Kodların özgün olduğunu göstermek için bazı kodlar Türkçe olarak yazılmıştır, normalde İngilizce olarak yazmaktayım)

## Hedef
Proje ile birlikte; MsSQL tabanlı ve içeriğini bilmediğimiz bir veritabanına ait datalara, otomatik olarak çekilen tablo ve kolon bilgileri ile seçim yaparak ulaşabilen ve bunlar üzerinde güncelleme işlemi yapabilen bir veritabanı uygulamasının gerçekleştirilmesi sağlanmıştır. (Yalnızca güncelleme işleminin yapılmasının sebebi; bir arkadaşımın işyerindeki vertabanında yer alan datalara, ekstra bir uygulama açmadan ya da Sql Komutu kullanmadan sadece mause ile tıklayarak ulaşarak güncelleme yapabilmek için benden program yazmamı istemiş olmasıdır.) 

## Çalışma Prensibi
Söz konusu sistemde; öncelikle Login penceresi gelmekte, burada kullanıcı adı, şifre ve veritabanı ismi girilmesi ile veritabanına bağlantı işlemi yapılmaktadır.
Bağlantının ardından, veritabanı içerisindeki varolan tablolar otomatik olarak çekilerek bir ComboBox yardımıyla listelenmekte ve ihtiyaç olunan tabloyu seçme imkanı sağlanmaktadır.
İlgili tablonun seçilmesinin ardından bu tabloda yer alan tüm sütun isimleri yine otomatik olarak çekilmekte ve bir ComboBox yardımıyla listelenmekte, böylece arama yapılmak istenilen sütunu seçme imkanı sağlanmaktadır.
Sütun isminin yer aldığı ComboBox 'ın hemen yanında aranmak istenilen kelimenin de girileceği bir TextBox bulunmakta ve buraya yazılacak text, arama tuşuna basıldığı anda; söz konusu veritabanında yer alan, seçilen tabloda yer alan, seçili sütunda aranarak, tüm sonuçlar liste halinde ekrana basılmaktadır.
Sonuçlar bir Table nesnesi yardımıyla ekrana basılmakta ve aynı zamanda tüm veriler satır satır görüntülenmektedir.
Haliyle yalnızca kullanıcı adı, şifre ve veritabanı ismi ile giriş yaptığımız sistemde, otomatik olarak gelen ve ComboBox 'lara yazılan tablo ve sütun isimlerini mouse yardımıyla seçerek; tablo ve tablolara ait sütun isimlerini hiç bilmediğimiz bir sistemdeki tüm noktalara ulaşım hakkı elde etmekteyiz. (Kullanıcının söz konusu veritabanlarına ulaşım için izni olduğu kabulüyle program yazılmıştır)
Daha sonra veritabanından alınarak ekrana basılan datalar üzerinde mouse ile güncellemek istediğimiz verinin üstüne tıklayarak, arayüzdeki güncelleme kısmından söz konusu verinin güncellemesi sağlanabilmektedir.

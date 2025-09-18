📚 Java'da OOP Tamoyillari
Bu loyiha Java dasturlash tilida Obyektga Yo'naltirilgan Dasturlash (OOP) tamoyillarini – Encapsulation, Inheritance,
Polymorphism va Abstraction – o'rganish uchun amaliy misollar to'plamini taqdim etadi. Har bir tamoyil sodda
tushuntirilgan va ishlaydigan Java kodlari bilan keltirilgan.
🚀 Loyiha haqida
Ushbu loyiha yangi boshlovchilar va o'rta darajadagi Java dasturchilariga OOPning 4 ta asosiy tamoyilini tushunishga
yordam beradi. Har bir tamoyil:

Qisqa ta'rifi bilan tushuntiriladi.
Nima uchun kerakligi keltiriladi.
Java'da amaliy va tushunarli misollar bilan mustahkamlanadi.

Loyiha kodlari sinab ko'rish uchun tayyor bo'lib, har bir misol sharhlar bilan tushunarli qilib yozilgan.
Xususiyatlar

✅ Encapsulation: Ma'lumotlarni yashirish va xavfsiz boshqarish.
✅ Inheritance: Kodni qayta ishlatish uchun sinflarni meros qilib olish.
✅ Polymorphism: Bir xil metodning turli shakllarda ishlashi.
✅ Abstraction: Murakkab detallarni yashirib, faqat kerakli qismini ko'rsatish.
📖 Har bir misol uchun qisqa va tushunarli sharhlar.

🛠 O'rnatish
Loyihani ishga tushirish uchun quyidagi qadamlarni bajaring:

JDK o'rnatish: Java Development Kit (JDK) 8 yoki undan yuqori versiyasini o'rnating. Oracle JDK yoki OpenJDK.
Reponi klonlash:git clone https://github.com/JavascriptDev347/java_deep_learning.git

IDE'da ochish: IntelliJ IDEA, Eclipse yoki boshqa Java IDE orqali loyihani import qiling.
Kompilyatsiya va ishga tushirish:javac Main.java
java Main

Yoki IDE'dagi "Run" tugmasini bosing.

📋 Foydalanish
Quyidagi bo'limlarda har bir OOP tamoyili uchun misollar keltirilgan. Kodlar src/ jildida joylashgan bo'lib, har bir
sinf alohida faylda saqlanadi.

1. Encapsulation (Inkapsulyatsiya)
   Ta'rif: Ma'lumotlarni (o'zgaruvchilarni) yashirish va ularni faqat maxsus metodlar (getter/setter) orqali
   boshqarish.Nima uchun? Ma'lumotlarni tasodifiy o'zgarishlardan himoya qiladi.Misol: Bank hisobi – balansni faqat
   maxsus metodlar orqali o'zgartirish mumkin.


2. Inheritance (Meros olish)
   Ta'rif: Bir sinf boshqa sinfdan xususiyat va metodlarni meros qilib oladi (extends orqali).Nima uchun? Kodni qayta
   ishlatish va umumiy xususiyatlarni markazlashtirish.Misol: Hayvonlar sinfi – it va mushuk umumiy xususiyatlarni meros
   qilib oladi.

3. Polymorphism (Polimorfizm)
   Ta'rif: Bir xil metod turli sinflarda turli xil ish bajaradi (@Override orqali).Nima uchun? Kodni moslashuvchan va
   kengaytiriladigan qiladi.Misol: Har xil hayvonlarning ovozi – bir xil speak() metodi, lekin turli natija.

4. Abstraction (Abstraksiya)
   Ta'rif: Murakkab detallarni yashirib, faqat kerakli funksiyalarni ko'rsatish (abstract sinf yoki interface orqali)
   .Nima uchun? Kodni soddalashtiradi va implementatsiyani keyinroq hal qilish imkonini beradi.Misol: Mashina – faqat
   haydash va to'xtash metodlari ko'rinadi, ichki mexanizm yashirin.

## Loyiha tuzilishi

```
oop-learning/
        ├──src/
        │ ├──encapsulation/
        │ │ └──Encapsulation.java
│ ├──inheritance/
        │ │ └──Animal.java
        │ │ └──Dog.java
        │ │ └──Inheritance.java
│ ├──polymorphism/
        │ │ ├──Car.java
        │ │ ├──Gelik.java
        │ │ ├──Polymorphism.java
        │ │ ├──Tesla.java
        
│ ├──abstraction/
        │ │ └──Abstraction.java
        │ │ └──Car1.java
        │ │ └──Vehicle.java
│ └──Main.java
```

🤝 Hissa qo'shish
Loyihaga hissa qo'shish uchun quyidagi qadamlarni bajaring:

Reponi fork qiling.
Yangi branch yarating: git checkout -b feature/yangi-misol
O'zgartirishlarni commit qiling: git commit -m "Yangi OOP misoli qo'shildi"
Push qiling: git push origin feature/yangi-misol
Pull Request oching.

Iltimos, kod sifati uchun CONTRIBUTING.md faylini o'qing (agar mavjud bo'lsa).
📜 Litsenziya
Bu loyiha MIT License ostida tarqatiladi. Batafsil ma'lumot uchun LICENSE faylini ko'ring.
📧 Aloqa
Savollar yoki takliflar bo'lsa, quyidagilar orqali bog'laning:

Email: javascriptdev347@email.com
GitHub: JavascriptDev
Telegram: @developer347

⭐ Agar loyiha foydali bo'lsa, yulduzcha qo'yishni unutmang! 🚀💡 Yangi misollar yoki tushuntirishlar qo'shishni
xohlaysizmi? Pull Request oching!
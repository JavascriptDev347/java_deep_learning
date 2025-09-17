package oop.inheritance;
//Inheritance (Meros olish)
//Oddiy ta'rif: Bir sinf (bola) boshqa sinfdan (ota) xususiyatlarni va metodlarni
//"meros qilib oladi" (extends orqali). Bu kodni takrorlamaslik uchun.
//Nima uchun kerak? Umumiy narsalarni bir joyda saqlab, yangi sinflarni tez yaratish.
//Misoli: Hayvonlar oilasini o'ylang – barcha hayvonlar ovqatlanadi,
//lekin it va mushuk har xil ovqatlanadi.

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Merosdan: "Hayvon ovqatlanmoqda..."
        myDog.bark();  // O'zining: "Vov-vov!"
    }

}

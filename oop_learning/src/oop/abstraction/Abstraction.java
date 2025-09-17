
/*
Abstraction (Abstraksiya)
Oddiy ta'rif: Murakkab detallarni yashirish, faqat kerakli qismini
 ko'rsatish (abstract class yoki interface orqali).
Nima uchun kerak? Kodni sodda qilish, implementatsiyani keyinroq hal qilish.
Misoli: Mashina haydashni o'ylang – siz gazga bosasiz,
lekin motor qanday ishlayotganini bilmaysiz.
 */
package oop.abstraction;


public class Abstraction {
    public static void main(String[] args) {
        Car1 car1 = new Car1();

        System.out.println("Started ----- ");
        car1.start();
        System.out.println("Stooope ----- ");
        car1.stop();
    }
}

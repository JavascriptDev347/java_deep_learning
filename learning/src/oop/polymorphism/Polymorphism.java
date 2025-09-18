package oop.polymorphism;

/*
Polymorphism (Polimorfizm)
Oddiy ta'rif: Bir xil metod turli sinflarda turli ish qilishi (override orqali).
Yoki interface orqali bir xil nomli metodlarni chaqirish.
Nima uchun kerak? Kodni moslashuvchan qilish – bir metod bir necha turga mos keladi.
Misoli: Shkallarni o'ylang – har xil hayvonlar "ovoz chiqaradi" (speak), lekin har xil.
 */

public class Polymorphism {
    public static void main(String[] args) {
        Car gelik = new Gelik();
        Tesla tesla = new Tesla();

        System.out.println("Gelik -------- ");
        gelik.matorType();
        gelik.balonCount();
        System.out.println("Tesla ------- ");
        tesla.matorType();
        tesla.balonCount();

    }
}

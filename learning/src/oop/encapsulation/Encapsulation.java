package oop.encapsulation;

//Encapsulation (Inkapsulyatsiya)
//Oddiy ta'rif: Ma'lumotlarni (o'zgaruvchilarni) va ularni boshqaruvchi metodlarni
//bir sinf ichida "yashirish". Tashqaridan faqat kerakli qismini ko'rsatish (private/public orqali).
// Bu xavfsizlik va xatolikni kamaytiradi.
//Nima uchun kerak? Ma'lumotlar tasodifan o'zgartirilmasin, faqat belgilangan yo'l orqali ishlatilsin.
//Misoli: Bank hisobini o'ylang – balansni faqat pul qo'shish/ayirish orqali o'zgartirish mumkin,
// to'g'ridan-to'g'ri emas.
public class Encapsulation {
    private double balance;

    //    getter
    public double getBalance() {
        return balance;
    }

    //    setter
    public void deposit(double amount) {
        //        add only positive number
        if (amount > 0) {
            balance += amount;
        }
    }

    //    withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }


}

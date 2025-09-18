package modifiers;

/*
Final sinf extends bo'lmaydi
Final o'zgaruvchi – o'zgartirib bo'lmaydi
Final metod – override bo'lmaydi
public static final constanta uchun ishlatiladi
 */
public final class FinalModifier {
    final double PI = 3.14;

    public final void finalMethod() {
        System.out.println("final method");
    }

    public void normalMethod() {
        System.out.println("normal method");
//        PI = 9.2; final variable not change
    }
}

import oop.encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.deposit(100);
        System.out.println("Encapsulation " + encapsulation.getBalance());
    }
}
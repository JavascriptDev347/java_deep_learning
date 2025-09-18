package modifiers;

public class PrivateModifier {
    private int secretVariable = 100;

    private void secretMethod() {
        System.out.println("Secret variable is: " + secretVariable);
    }

    public void accessSecret() {
        secretMethod();
        System.out.println("secret method working ");

    }
}

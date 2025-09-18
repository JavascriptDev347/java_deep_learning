package modifiers;

public class Test {
    public static void main(String[] args) {
        PublicModifier publicModifier = new PublicModifier();
        publicModifier.publicMethod();
        System.out.println(publicModifier.str);

        PrivateModifier privateModifier = new PrivateModifier();
        privateModifier.accessSecret();

        FinalModifier finalModifier = new FinalModifier();
        finalModifier.finalMethod();
        finalModifier.normalMethod();

        RecordModifier recordModifier = new RecordModifier("Rustam", 22);
        System.out.println(recordModifier.age());
        System.out.println(recordModifier.name());
        System.out.println(recordModifier.greet());

    }
}

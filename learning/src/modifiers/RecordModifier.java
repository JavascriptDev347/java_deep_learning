package modifiers;

//Record – avto constructor va getter'lar
// Qo'shimcha metod qo'shsa bo'ladi
public record RecordModifier(String name,
                             int age) {

    public String greet() {
        return "Hello " + name + " good";
    }
}

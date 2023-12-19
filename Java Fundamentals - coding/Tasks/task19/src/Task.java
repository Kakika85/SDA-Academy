public class Task {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.wagTail();

        Dog sparky = new Dog("Sparky");
        sparky.wagTail();
    }
}
public class Dog extends Animal {
    public static int count;

    public Dog(String name, int swim, int run) {
        super(name, "Собака", swim, run);
        ++count;
    }

}

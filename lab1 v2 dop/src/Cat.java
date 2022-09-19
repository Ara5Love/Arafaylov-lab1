public class Cat extends CatsFamily {
    public static int count;

    public Cat(String name, int swim, int run, int jump) {
        super(name, "Кот", swim, run, jump);
        ++count;
    }
}

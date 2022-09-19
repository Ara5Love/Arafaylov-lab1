public class Tiger extends CatsFamily {
    public static int count;

    public Tiger(String name, int swim, int run, int jump) {
        super(name, "Тигр", swim, run, jump);
        ++count;
    }
}
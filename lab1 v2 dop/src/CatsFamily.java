
public class CatsFamily extends Animal {

    public int jump;

    public CatsFamily(String name, String type, int swim, int run, int jump) {
        super(name, "Сем.кошачьих", swim, run);
        this.jump = jump;
    }


    public void jump(int dist) {

        if (this.jump < dist) {
            if (this.jump == 0) {
                System.out.print(this.Type + " " + this.Name + " не умеет прыгать");
            }
            else {System.out.print(this.Type + " " + this.Name + " не смог перепрыгнуть");
            }
        } else {
            System.out.print(this.Type + " " + this.Name + " смог перепрыгнуть: " + dist);
        }
        System.out.println("\r");

    }
}

public class Animal {
    public static int count = 0;
    public String Name;
    public String Type;
    public int swim;
    public int run;

    public Animal(String name, String type, int swim, int run) {
        ++count;
        this.Name = name;
        this.Type = type;
        this.swim = swim;
        this.run = run;
    }

    public void Run(int dist) {

        if (this.run < dist) {
            System.out.print(this.Type + " " + this.Name + " не смог пробежать");
        } else {
            System.out.print(this.Type + " " + this.Name + " смог пробежать: " + dist);
        }
        System.out.println("\r");

    }

    public void Swim(int dist) {

        if (this.swim < dist) {
            if (this.swim == 0) {
                System.out.print(this.Type + " " + this.Name + " не умеет плавать");
            }
            else {System.out.print(this.Type + " " + this.Name + " не смог проплыть");
            }
        } else {
            System.out.print(this.Type + " " + this.Name + " смог проплыть: " + dist);
        }
        System.out.println("\r");

    }
}
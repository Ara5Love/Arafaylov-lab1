public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Шарик", 50, 500),
                new Dog("Бобик", 50, 500),
                new Dog("Плюш", 50, 500),
                new Cat("Васька", 0, 200, 50),
                new Tiger("Тигрун", 150, 1500, 100)
        };

        Animal[] var2 = animals;
        int var3 = animals.length;

        //Cat barsik = new Cat("Барсик", 0, 200, 50);
        ((Tiger)animals[4]).jump(30);
        ((Cat)animals[3]).jump(30);
        //animals[3].Run(30);
        //animals[4].Run(30);
        //((CatsFamily)animals[0]).jump(30);


        //barsik.jump(30);


        //for(int var4 = 0; var4 < var3; ++var4) {
        //   Animal a = var2[var4];
        //   a.Run(300);
        //   a.Swim(10);
        //}

        System.out.println("\n");

      //  System.out.println("Animal: " + Animal.count);
        //  System.out.println("Cat: " + Cat.count);
      //  System.out.println("Tiger: " + Tiger.count);
      //  System.out.println("Dog: " + Dog.count);
    }
}
class Animal{
    int legs;
    int tailings;
    int teeth;
    int gills;
    int fins;

    void move()
    {
        System.out.println("Тыгыдынь бынь бынь");
    }
    void bit(){
        System.out.println("Грррр- дынь дынь");
    }
    void eat(){
        System.out.println("Ням ням ам ам ");
    }
    void voice(){
        System.out.println("Тутам парам пам пам");
    }
}

class Dog extends Animal{

     void move(){
        System.out.println("Раз два три четыре");
    }
      void voice()
    {
        System.out.println("Гав гав");
    }
}
class Worm extends Animal{
    void eat(){
        System.out.println("ням ням навоз");
    }
    @Override
    void move()
    {
        System.out.println("Медленно");
    }
}
class Kotyachie extends Animal{

    int legs=4;
    @Override
    void voice()
    {
        System.out.println("Мяу");
    }
}


class Cat extends Kotyachie{

    @Override
    void move()
    {
        System.out.println("быстро");
    }

    void bit(){
        System.out.println("Постоянно");
    }

    void move(int legs){
        System.out.println("Бегу всеми  - "+legs);
    }


}




public class Main {

    public static void main(String[] args) {




        Animal a = new Animal();
        a.move();

        Animal b = new Kotyachie();
        b.move();

        Animal c = new Kotyachie();
        c.voice();

        Animal d = new Dog();
        d.move();
        d.voice();
        d.bit();
        d.eat();



    }
}

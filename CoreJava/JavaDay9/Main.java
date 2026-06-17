package JavaDay9;

// class A 
// {
//     public void show1()
//     {
//         System.out.println("In A Show");
//     }
// }

// class B extends A 
// {
//     public void show2() {
//         System.out.println("In B Show");
//     }
// }

abstract class Car
{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

abstract class WagonR extends Car       //compulsary to define all the methods if we don't implement all the methods then in this case we have to declare it as an abstratct class
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdateWagonR extends WagonR       //concrete class
{
    public void fly() {
        System.out.println("Flying");
    }
}

public class Main {
    public static void main(String[]args) {
        // TypeCasting
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(d);
        // System.out.println(i);

        // A obj = new B();    // upcasting
        // obj.show1();

        // B obj1 = (B) obj;   // downcasting
        // obj1.show2();

        //Wrapper Class
        int num = 7;
        Integer num1 = num; //autoboxing

        // int num2 = num1.intValue(); //autoboxing
        int num2 = num1; //auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);
        // System.out.println(num3*2);

        //Abstract Keyword
        // Car obj = new Car();        //can't create object of abstract class
        Car obj = new WagonR();   
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

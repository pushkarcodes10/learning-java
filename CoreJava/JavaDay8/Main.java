package JavaDay8;


// class A {
//     public void show() {
//         System.out.println("In A Show");
//     }
// }

class Laptop {
    String model;
    int price;

    public String toString() 
    {
        // return "Hey";
        return model + " : " + price;
    }

public boolean equals(Laptop that)
{
    if(this.model.equals(that.model) && this.price == that.price) {
        return true;
    }
    else {
        return false;
    }
 }
}
// class B extends A {
//     public void show() {
//         System.out.println("In B Show");
//     }
// }

// class Calc
// {
//     public final void show()
//     {
//         System.out.println("By Pushkar");
//     }

//     public void add(int a, int b)
//     {
//         System.out.println(a + b);
//     }

//     class AdvCalc extends Calc
//     {
//         @Override
//         public void show()
//         {
//             System.out.println("By Messi");
//         }
//     }
// }

public class Main
{
    public static void main(String[] args)
    {
        // A obj = new A();
        // obj.show();

        // obj = new B();
        // obj.show();

        // Calc calc = new Calc();
        // Calc.AdvCalc obj = calc.new AdvCalc();

        // obj.show();
        // obj.add(4, 5);

        Laptop obj1 = new Laptop();
        obj1.model = "Dell G15";
        obj1.price = 75500;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell G15";
        obj2.price = 75500;

        // boolean redult = obj1 == obj2;
        // boolean result = obj1.equals(obj2);

        System.out.println();
    }
}
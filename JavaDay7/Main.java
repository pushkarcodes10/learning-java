package JavaDay7;

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

// class A{
//     public void show()
//     {
//         System.out.println("In A Show");
//     }

//     public void configA()
//     {
//         System.out.println("In A config");
//     }
// }
// class B extends A {
//     public void show() {
//         System.out.println("In B Show");
//     }
// }

public class Main {
    public static void main(String[]args) {
        // B obj = new B();
        // obj.show();
        // obj.configA();

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4 , 5);
        System.out.println(r1);
    }
}

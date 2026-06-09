package JavaDay6;

class A extends Object
{
    public A() {
    super();
    System.out.println("in A");    
    }  

    public A(int n) {
    super();
    System.out.println("in A int");    
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }
}

public class Main {
    public static void main(String[]args) {
        // VeryAdvCalc obj = new VeryAdvCalc();
        // int r1 = obj.add(4, 5);
        // int r2 = obj.sub(7, 3);
        // int r3 = obj.multi(7, 3);
        // int r4 = obj.div(15, 3);
        // double r5 = obj.power(2, 3);
        // System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        // B obj = new B(5);
        B obj = new B(5);
    }
}

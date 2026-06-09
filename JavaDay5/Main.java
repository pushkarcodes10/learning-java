// package JavaDay5;

// class Human {
//     private int age;
//     private String name;

    

//     public Human() {                        // default constructor
//         age = 12;
//         name = "John";
//     }
//     // public Human(int a, String n) {         //Parameterized Constructor
//     //     age = a;
//     //     name = n;
//     // }

//     public Human(String name) {
//         this.name = name;
//         this.age = 12;
//     }

//     public Human(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setName(String name)  {
//         this.name = name;
//     }
    
//     public void setAge(int age)  {
//         this.age = age;
//     }

// }

// public class Main {
//     public static void main(String[]args) {
//         Human obj = new Human();
//         Human obj1 = new Human("Pushkar");
//         System.out.println(obj.getName() + " : " + obj.getAge());
//         System.out.println(obj1.getName() + " : " + obj1.getAge());
//     }
// }

// static keyword

// package JavaDay5;

// class Mobile {
//    String brand;
//    int price;
//    static String name;

//     static {
//         name = "Phone";
//         System.out.println("In Static Block");
//     }

//    public Mobile()
//    {
//     brand = "";
//     price = 200;
//     System.out.println("In Constructor Block");
//    }

//    public void show()
//    {
//     System.out.println(brand + " : " + price + " : " + name);
//    }

// }
// public class Main {
//     public static void main(String[]args) throws ClassNotFoundException {

//         Class.forName("JavaDay5.Mobile");

//     //    Mobile obj1 = new Mobile();
//     //    obj1.brand = "Apple";
//     //    obj1.price = 1500;
//     //    Mobile.name = "SmartPhone"; 

//     //    Mobile obj2 = new Mobile();

//     }
// }

package JavaDay5;

    class A {
        public A()
        {
            System.out.println("Object Created");
        }
        public void show()
        {
            System.out.println("in A show");
        }
    }

public class Main {
    public static void main(String[]args) {
        // A obj;
        // obj = new A();
        // obj.show();

        new A().show();
        new A().show();
    }
}
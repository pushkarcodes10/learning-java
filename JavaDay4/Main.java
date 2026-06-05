// package JavaDay4; 

// class Human
// {
//     private int age /*= 19*/;
//     private String name /*= "Pushkar"*/;

//     public int getAge() {
//         return age;
    
//     }
//     public void setAge(int a) {
//         age = a;
//     }  

//     public void setName(String n) {
//         name = n;
    
//     }
//     public String getName() {
//         return name;
//     }
// }

// public class Main {
//     public static void main(String[]args) {
//         // String
//         String name = new String("Pushkar");
//         // System.out.println(name);
//         // System.out.println(name.charAt(2));
//         // System.out.println(name.concat(" Raj"));
//         // System.out.println("Hello " + name);
//         // System.out.println(name.hashCode());

//         // StringBuffer
//         StringBuffer sb = new StringBuffer("Pushkar");
//         // System.out.println(sb.capacity());
//         // System.out.println(sb.length());

//         sb.append(" Raj");
//         sb.deleteCharAt(2);
//         // System.out.println(sb);

//         // Encapsulation

//         Human obj = new Human();
//         // obj.age = 20;
//         // obj.name = "Pushkar";

//         obj.setAge(20);
//         obj.setName("Pushkar");

//         // System.out.println(obj.getName());
//         // System.out.println(obj.getAge());
//         // System.out.println(obj.getName() + " : " + obj.getAge());
//         System.out.println(obj.getName() + " : " + obj.getAge());
//     }
// }

package JavaDay4;

class Human
{

    private int age /*= 19*/;
    private String name /*= "Pushkar"*/;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

     public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[]args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Raj");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
/*
package JavaDay3;

// class Student 
// {
//     int rollno;
//     String name;
//     int marks;
// }

class Calculator {
    int num = 5;

    public int add(int n1, int n2)
    {
            return n1 + n2;
        }
        
        // Method Overloading
        // public double add(double n1, int n2)
        // {
            //     return n1 + n2;
            // }
        }
        // public int add(int n1, int n2, int n3) 
        // {
        //     System.out.println(num);
        //     return n1 + n2 + n3;
        // }
        
public class Main {
public static void main(String[]args) {
        // int num1 = 4;
        // int num2 = 5;
        
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        int r1 = calc.add(25, 10);

        calc.num = 8;

        System.out.println(calc.num);
        System.out.println(calc1.num);
    }
}     
*/  


/*
package JavaDay3;

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10) 
            return "Pen";

            return "Nothing";
    }
}

public class Main {
public static void main(String[]args) {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(2);
        System.out.println(str);
    }
}   */

// Arrays

package JavaDay3;

public class Main {
    public static void main(String[]args) {
        // int nums[] = {3 ,7, 2, 4};

        // for(int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }
        // int nums[] = new int[4];;
        
        // int nums [] [] = new int[3][4];
        int nums [] [] = new int[3][];     //  jagged array
        
        nums[0] = new int[3];;
        nums[1] = new int[4];;
        nums[2] = new int[4];;

          for(int i=0; i<nums.length;i++) {
              for(int j=0; j < nums[i].length; j++) {
               nums[i][j] = (int)(Math.random() * 10);
            }       
        }

        // for(int i=0; i<3;i++) {
        //     for(int j=0; j<4; j++) {
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }

        // }
        // for(int i=0; i<3;i++) {
        //     for(int j=0; j<4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int n[] : nums)
        {
            for(int m:n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

             // Student s1 = new Student();
        // s1.rollno = 25;
        // s1.name = "Pushkar";
        // s1.marks = 77;

        // Student s2 = new Student();
        // s2.rollno = 26;
        // s2.name = "Harsh";
        // s2.marks = 87;

        // Student s3 = new Student();
        // s3.rollno = 27;
        // s3.name = "Kiran";
        // s3.marks = 97;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(int i=0;i<students.length;i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        // for(Student stud : students)
        // {
        //     System.out.println(stud.name + " : " + stud.marks);
        // }

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }

    //     for(int n : nums)
    //     {
    //         System.out.println(n);
    //     }

    }
}
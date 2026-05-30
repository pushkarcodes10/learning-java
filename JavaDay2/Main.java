package JavaDay2;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String a[]) {
        // Ternary Opreators        ?:
        int n = 4;
        int result = (n % 2 == 0)   ? 10 : 20;
        // System.out.println(result);

        // switch
        int d = 2;

        switch(d) {
            case 1:
                // System.out.println("Monday");
                break;
            case 2:    
                // System.out.println("Tuesday");
                break;
            case 3:
                // System.out.println("Wednesday");
                break;
            case 4:
                // System.out.println("Thursday");
                break;
            case 5:
                // System.out.println("Friday");
                break;
            case 6:
                // System.out.println("Saturday");
                break;
            case 7:
                // System.out.println("Sunday");
                break;
            default:
                // System.out.println("Enter Valid Day");
            }

            // loops and nested loops
            // int i = 5;
            
            // while (i <= 10) {
            //     // System.out.println("Hello " + i);
            //     int j = 1;
            //     while (j <= 3) {
            //         // System.out.println("Hi" + j);
            //         j++;
            //     }
            //     i++;
            // }
            
            // do {
            //     System.out.println("Hello " + i);
            //     i++;
            // } while (i <= 4);

            for(int i =1;i <= 5;i++)  {
                System.out.println("DAY " + i);
                for(int j=9; j<18; j++) {
                    System.out.println(j + " - " + (j + 1));
                }
            }
    }
}
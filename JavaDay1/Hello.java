package JavaDay1;

class Hello {
    public static void main(String args[])
    {

        // print statements
        // System.out.println("Hello World");       // System.out.println() Print Statement prints in new line

        //primitive data types
        int num = 9;
        byte by = 127;
        short sh = 558;
        long lo = 5854l;
        float f = 5.8f;
        double d = 5.8;
        char c = 'k';
        c++;
        boolean bn = true;

        //literals
        int num1 = 0b101;
        int num2 = 0x101;
        int num3 = 100_00_00_000;
        double num4 = 12e10;

        byte da = 127;
        int an = 257;
        byte k = (byte)an;

        float fa = 5.6f;
        int t = (int) f;

        // opreators
        byte a = 10;
        byte b = 30;
        int result1 =  a * b;
        int division = b / a;

        int num5 = 7;
        // num5 = num5 + 2;
        // num5 += 2;      //+,-,*,/

        // num5++; // post increment
        // ++num5; //pre increment
        // num5--;
        // --num5;

        int result2 = num5++;   // fetch value first and then increament
        int result3 = ++num5;   // increament first then fetch value

        //relational opreators
        
        int x = 6;
        int y = 6;

        boolean result4 = x < y;
        boolean result5 = x >= y;

        int p = 25;
        int s = 10;
        int l = 20;
        int e = 23;

        boolean result6 = p > s || l > e;

        int g = 18;
        int h = 18;

        if (g > 10) {
            // System.out.println("Hello");            
        }   else {
            // System.out.println("World");
        }

        // if (h > 10) 
            // System.out.println("Hello");            
        // else 
            // System.out.println("World");


        if (false)                                 // will not print because condition is false
            // System.out.println("Hello");

        if (true) {                                // will print because condition is true
            // System.out.println("Hello");
        }

        if (p > s) {
            System.out.println(p);
        }   else {
            System.out.println(s);
        }

        // System.out.println(!result6);
    }
}
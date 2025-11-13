package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        int intResult;
        double x = 1.5D;
        double y = 2.3D;
        double doubleResult;

        // a
        intResult = c - a * 3;
        System.out.println(intResult);
        
        // b
        intResult = c / b;
        System.out.println(intResult);
        
        // c
        intResult = a + b / c;
        System.out.println(intResult);
        
        // d
        doubleResult = c / b;
        System.out.println(doubleResult);
        
        // e
        doubleResult = c + a / b;
        System.out.println(doubleResult);

        //f
        doubleResult = x + y * b;
        System.out.println(doubleResult);
        
    }
}

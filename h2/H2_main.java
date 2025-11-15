package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        int input = 10; // only 0, 1, 10, 11 allowed

        switch (input) {
            case 0:
                x = false;
                y = false;
                break;
            case 1:
                x = false;
                y = true;
                break;
            case 10:
                x = true;
                y = false;
                break;
            case 11:
                x = true;
                y = true;
                break;
        }

        a = (x && y); // E1 and E2
        b = (x || (x != y)); // E1 or E1 not equals E3
        c = (x && y) ? false : (x && !y) ? true : (!x && y) ? false : true; // 11 0, 10 1, 01 0, 00 1

        /* System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c); */
    }
}

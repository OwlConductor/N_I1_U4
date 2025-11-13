package p3;

public class P3_main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // a
        boolean a = !(x!=y && x==y);

        // b
        boolean b = x || true;

        // c
        boolean c = x && false;

        // d
        boolean d = (x && !y) || (!x);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

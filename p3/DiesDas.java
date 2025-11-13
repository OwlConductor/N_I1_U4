package p3;

public class DiesDas {
    public static void main(String[] args) {
        
        for(boolean x : new Boolean[]{true,false}) { // X
            for(boolean y : new Boolean[]{true,false}) { // Y
                System.out.println("\nX: " + x + "    Y: " + y);
                System.out.print("a: " + (!(x!=y && x==y))); // a
                System.out.print(" b: " + (x || true)); // b
                System.out.print(" c: " + (x && false)); // c
                System.out.println(" d: " + ((x && !y) || (!x))); // d
            }
        }
    }
}

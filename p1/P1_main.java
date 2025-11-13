package p1;

public class P1_main {
    public static void main(String[] args) {
        int stockwerk = 0;

        switch (stockwerk) {
            case -1:
                System.out.print("Parkhaus");
                break;
            case 0:
            System.out.print("Angebote");
                break;
            case 1:
                System.out.print("Damenbekleidung");
                break;
            case 2:
                System.out.print("Herrenbekleidung");
                break;
            case 3:
                System.out.print("Kinderbekleidung");
            default:
                System.out.print("unbekannt");
                break;
        }

        switch (stockwerk) {
            case -1:
                System.out.print("Parkhaus");
                break;
            case 0:
            System.out.print("Angebote");
                break;
            case 1:
                System.out.print("Damenbekleidung");
                break;
            case 2:
                System.out.print("Herrenbekleidung");
                break;
            case 3:
                System.out.print("Kinderbekleidung");
            default:
                System.out.print("unbekannt");
                break;
        }



    }
}

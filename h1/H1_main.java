package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 100;
        double price = 0.74D;

        price = 0D; // remove price input
        switch (zone){
            case 1:
                price = 2.0D;
                break;
            case 2:
                price = 2.35D;
                break;
            case 3:
            case 4:
                price = 2.85D;
                break;
            case 5:
                price = 3.55D;
                break;
            default:
                price = 4.0D;
            break;
        }
        System.out.println("\nStationen : " + zone + "\nPreis : " + price + "€");
    }
}

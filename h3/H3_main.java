package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2F; // 32bit
        float fahrenheitFloat = 0F;
        double celsiusDouble = 14.2D; // 64bit
        double fahrenheitDouble = 0D;

        fahrenheitFloat = celsiusFloat * 9F / 5F + 32F;
        fahrenheitDouble = celsiusDouble * 9D / 5D + 32D;

        System.out.println("float celsius : " + celsiusFloat);
        System.out.println("float fahren. : " + fahrenheitFloat);
        System.out.println("double celsius : " + celsiusDouble);
        System.out.println("double fahren. : " + fahrenheitDouble);
    }
}

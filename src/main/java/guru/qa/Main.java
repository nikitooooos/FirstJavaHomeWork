package guru.qa;

public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400;
        byte q = 126;
        byte w = 100;
        float f = 24.5F;
        double d = 74.1;

        //Операторы арифметики
        System.out.println("b + s = " + (b + s));
        System.out.println("i + d = " + (i + d));
        System.out.println("b - s = " + (b - s));
        System.out.println("b * i = " + (b * i));
        System.out.println("i / b = " + (i / b));
        System.out.println("i % b = " + (i % b));

        //Операторы сравнения
        System.out.println("s == b = " + (s == b) );
        System.out.println("s != b = " + (s != b) );
        System.out.println("s > b = " + (s > b) );
        System.out.println("s < b = " + (s < b) );
        System.out.println("b >= s = " + (b >= s) );
        System.out.println("b <= s = " + (b <= s) );

        //Переполнение
        System.out.println("q + w = " + (q + w));
    }
}
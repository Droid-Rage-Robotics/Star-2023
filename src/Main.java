
public class Main {
    public static void main(String[] args) {
        printOut();
    }

    public static void printOut() {
        System.out.println("Hello World!");

        int a = 123;
        int b = 567;
        b = a;
        System.out.println("\nPrinted Int a: " + a);
        System.out.println("Printed Int b: " + b);
        
        double num = 3.3;
        System.out.println("\nPrinted Double num: " + num);
    }
}
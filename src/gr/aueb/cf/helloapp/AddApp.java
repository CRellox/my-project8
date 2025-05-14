package gr.aueb.cf.helloapp;

public class AddApp {

    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.printf("%4d", add(7, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

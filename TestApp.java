package testapp;

public class TestApp {
    public static void main(String[] args) {
        SimpleCalc sc = new SimpleCalc(20, 10);
        // Змінюємо цей самий рядок, але на множення
        System.out.println("a*b="+(sc.getMult()));
    }
}
package testapp;

public class TestApp {
    public static void main(String[] args) {
        SimpleCalc sc = new SimpleCalc(20, 10);
        
        // Ось виправлений блок, що включає зміни з обох гілок
        System.out.println("a*b=" + sc.getMult());
        System.out.println("a/b=" + sc.getDiv());
    }
}
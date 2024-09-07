package javaapplication;

public class Calculation3 {
    int sum(int a, int b) {
        System.out.println(a + b);
    }

    double sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        Calculation3 obj = new Calculation3();
        obj.sum(20, 20);
        
    }
}

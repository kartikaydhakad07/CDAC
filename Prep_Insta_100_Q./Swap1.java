

public class Swap1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 45;

        System.out.println("before swap : a = "+ a + " b = "+ b);

        // a = a + b;
        // b = a - b;
        // a = a - b;

        // a = a * b;
        // b = a / b;
        // a = a / b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swap : a = "+ a + " b = "+ b);
    }
}

package ch06class;

public class C04array {
    public static void main(String[] args) {
        int[] a = {3, 4};
        System.out.println("a[0] = " + a[0]);
        a = method01();
        System.out.println("a[0] = " + a[0]);

    }

    private static int[] method01() {
        int[] k = {22, 33};
        return k;
    }
}

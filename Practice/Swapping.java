public class Swapping {
    public static void main(String[] args) {
        int m = 10, n = 5;
        System.out.println("Before swapping: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;
        System.out.println("After swapping: m = " + m + ", n = " + n);

        // Swapping two variables without using 3rd variable
        m = 11;
        n = 9;
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}
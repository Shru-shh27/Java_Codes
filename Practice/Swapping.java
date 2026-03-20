import java.util.*;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int var1 = sc.nextInt();
        int var2 = sc.nextInt();

        System.out.println("Before swapping: var1 = " + var1 + ", var2 = " + var2);

        int temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("After swapping: var1 = " + var1 + ", var2 = " + var2);

        // Swapping two variables without using 3rd variable
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("After swapping: var1 = " + var1 + ", var2 = " + var2);

        sc.close();
    }
}
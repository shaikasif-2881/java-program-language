import java.util.*;

public class Num1ton {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();
        int counter = 1;

        while (counter <= n) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}

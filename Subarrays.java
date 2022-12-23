import java.math.MathContext;
public class Subarrays {
    public static void subarrays(int numbers[]) {
        int tp = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for ( int j = i; j < numbers.length; j++) {
                int end = j;
        
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " " );
                    sum= sum + numbers[k]; 
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs: " + tp);
        System.out.println("sum is :" + sum);
    }
    public static void main(String args []) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
    }
}
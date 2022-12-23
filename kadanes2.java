public class kadanes2 {
    public static void kadanes(int numbers[]) {
        int cs = 0;
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = cs;
            }
             mn = Math.min(cs,numbers[i]);
        }
        System.out.println("our min subarraysum is = " + mn);
    }
    public static void main(String args []) {
        int numbers[] = { -1,-2,-3,-4,-5};
        kadanes(numbers);
    }
}

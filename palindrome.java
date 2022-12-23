public class palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                // not a palindrome condition
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "asif";
        System.out.println(isPalindrome(str));
    }
}

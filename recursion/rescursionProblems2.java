package recursion;

public class rescursionProblems2 {
    //  write a static function that takes an integer n and returns the sum of the first n natural numbers
    public static int sumOfFirstN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirstN(n - 1);
    }
    
}

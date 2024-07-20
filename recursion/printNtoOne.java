package recursion;


// Tail recusion example tail recusrion is always faster than non tail recursion with tail call elemination by compiler that makes the code faster
// Tail recursion is a recursion where the recursive call is the last thing in the function. There is no need to keep the record of the previous state.
public class printNtoOne {
    public void printNtoOneNumbers(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        printNtoOneNumbers(n-1);    
    }   
}


class Palindrome{
    public boolean isPalindrome(String s, int start, int end){
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start + 1, end - 1);
    }
}


class JosepheuProblem{
    public int findLastPerson(int n, int k){
        if (n ==1){
            return n;
        }
        int val = (findLastPerson(n-1, k)+k-1);
        int retVal = val % n+1;
        return retVal;
    }
}



class RunCode{
    public static void main(String [] args){
        printNtoOne p = new printNtoOne();
        // p.printNtoOneNumbers(5);

        Palindrome pal = new Palindrome();
        String s = "aaaa";
        // System.out.println(pal.isPalindrome(s, 0, s.length()-1));

        JosepheuProblem jp = new JosepheuProblem();
        System.out.println(jp.findLastPerson(7, 3));
    }
}
import java.util.*;

public class PalindromeCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (isPossiblePalindrome(str))
        {
            System.out.println("true");
        } else 
        {
            System.out.println("false");
        }
    }

    private static boolean isPossiblePalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String str, int left, int right)
    {
        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
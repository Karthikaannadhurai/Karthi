public class palindrome
{

    public static void main(String args[])
    {
        
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
        
        if(isPalindrome(palindrome))
        {
            System.out.println("Number : " + palindrome + " is a palindrome");
        }
        else
        {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }       
        
    }

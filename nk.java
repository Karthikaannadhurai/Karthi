public class Digits
{
    static long firstkdigits(int n, int k)
    {
        long product = 1;
        for (int i = 0 ; i < n ; i++)
        {
           product *= n;
           }
       while ((int)(product / Math.pow(10, k)) != 0)
            {
            product = product / 10;
        return product;
            }
    }
     
    public static void main(String[] args)
    {
      int n = 15;
      int k = 4;
      System.out.println(firstkdigits(n, k));
    }
}

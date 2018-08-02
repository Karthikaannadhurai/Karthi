class GFG {
     
    static long countOfMultiples(long n)
    {
         
        return (n/3 + n/5 - n/15);
    }
     
   
    static public void main (String[] args)
    {
        System.out.println(countOfMultiples(6));
        System.out.println(countOfMultiples(16));
    }
}

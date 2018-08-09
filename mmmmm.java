class CFEA{
  public static void main(String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for(int i = 0 ; i<testCases;++i)
    {
     long sum = 0;
     ArrayList<Integer> mySort = new ArrayList<Integer>();
     int n = scan.nextInt();
      for(int j = 1 ; j <= n ; ++j)
      {
       mySort.add(scan.nextInt());
      }
     Collections.sort(mySort);
      for(int j = mySort.size()-1 ; j >= 0 ; j=j-2){
         sum += mySort.get(j);
      }
     System.out.println(sum);
    }
  }
}

class demo
{
public static void main(String…s)
{
int i,n,large,small;
Scanner sc=new Scanner(System.in);

System.out.print(“Enter number of elements:”);
n=sc.nextInt();
int a[]=new int[n];

System.out.print(“nEnter elements of Array:”);
for(i=0;i<n;++i)
a[i]=sc.nextInt();

large=a[0];
for(i=1;i<n;++i)
{
if(a[i]>large)
large=a[i];
}
System.out.println(“nLargest Element:”+large);
}
}

import java.util.*;
class stack
{
public static void main(String args[]) throws Exception
{
Scanner sc=new Scanner(System.in);
int l,n1,j,i,c,k,t;
long n;
long a[]=new long[10000];
t=Integer.parseInt(sc.next());
for(i=1;i<=t;i++)
{
n1=Integer.parseInt(sc.next());c=0;
for(j=0;j<n1;j++)
a[j]=0;
a[c]=Long.parseLong(sc.next());c++;
for(j=1;j<n1;j++)
{
n=Long.parseLong(sc.next());
if(n<a[c-1])
{
k=0;
while(n>=a[k])
{
k++;
}
a[k]=n;
}
else
{
a[c++]=n;
}
}
System.out.print(c+" ");
for(j=0;j<c;j++)
System.out.print(a[j]+" ");
System.out.println();
}
}
}
import java.util.*;
class final1
{
public static void main(String args[]) throws Exception
{
Scanner sc=new Scanner(System.in);
int t,i,n,k,j,j1;
int res[]=new int[200];
String str[]=new String[200];
String str1,st;
t=Integer.parseInt(sc.next());
for(i=1;i<=t;i++)
{
n=Integer.parseInt(sc.next());
k=Integer.parseInt(sc.next());
for(j1=0;j1<n;j1++)
{
str[j1]=sc.next();
str[j1]=str[j1]+" ";
res[j1]=0;
}
str1=sc.nextLine();
for(j1=0;j1<k;j1++)
{
str1=sc.nextLine();
str1=str1+" ";
for(j=0;j<n;j++)
{
if(res[j]==1)
continue;
if(str1.contains(str[j]))
res[j]=1;
}
}
for(j=0;j<n;j++)
{
if(res[j]==1)
System.out.print("YES ");
else
System.out.print("NO ");
}
System.out.println();
}
}
}

import java.util.*;
class sec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j,m,count=0;
char c,c1;String s;
t=Integer.parseInt(sc.next());
for(i=1;i<=t;i++)
{
s=sc.next();count=0;j=1;
while(j<s.length())
{
c=s.charAt(j);
c1=s.charAt(j-1);
j++;
if(c==c1)
count++;
}
System.out.println(count);
}
}
}
import java.util.*;
import java.io.*;
class first
{
public static void main(String args[]) throws Exception
{
long p,j,i;
Scanner sc=new Scanner(System.in);
long t=sc.nextLong();
for(i=1;i<=t;i++)
{
long s=sc.nextLong();
j=(long)Math.sqrt(s);
while(true)
{
p=j*(j+1)*(2*j+1)/6;
if(p<=s)
break;
else
j--;
}
System.out.println(j);
}
}
} 
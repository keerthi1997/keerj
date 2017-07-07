import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n;
boolean k=false;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
if(n%400==0)
k=true;
else if(n%100==0)
k=false;
else if(n%4==0)
k=true;
else
k=false;
if(k)
System.out.println(n+" is leap year");
else
System.out.println(n+" is not leap year");
}
}

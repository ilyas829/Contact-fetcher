import java.io.*;
import java.util.*;
class B3
{
public static void main(String args[])
{
try
{
FileInputStream fis=new FileInputStream("Details.txt");
Scanner sc=new Scanner(fis).useDelimiter("\t");
Hashtable ht=new Hashtable();
String a[],a1,str;
while(sc.hasNext())
{
a1=sc.nextLine();
a=a1.split("\t");
ht.put(a[0],a[1]);
System.out.println(a[0]);
System.out.println(a[1]);
}
Scanner s=new Scanner(System.in);
System.out.println("enter the name:");
str=s.next();
if(ht.containsKey(str))
{
System.out.println("phone number:"+ht.get(str));
}
else
{
System.out.println("name not matched:");
}
}
catch(Exception e)
{
}
}
}

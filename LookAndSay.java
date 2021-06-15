class LookAndSay
{
public static void main(String args[])
{
int n=10;
System.out.println(1);
String s="1";

for (int i=1;i<n;i++)
{
String s1="";
int count=1;
char a=s.charAt(0);
for(int j=1; j<s.length(); j++)
{
if(s.charAt(j)!=s.charAt(j-1))
{
System.out.print(count +" " +a);
s1+= ""+ count + "" + a;
a=s.charAt(j);
count=1;
}
else
count++;
}
System.out.println(count +" " +a);
s1+= ""+ count + "" + a;
s= s1;
}
}
}
import java.io.*;
class ButterflyPattern
{
public static void main(String args[])
{
int input=5;
int temp1=input;
int temp2=0;
for (int i=1; i<=input;i++){
for(int m=1;m<=i;m++)
System.out.print("*");
for (int j= (temp1*2)-2; j>0; j--)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print("*");
System.out.println();
temp1--;
}
for (int i2=input; i2>0;i2--){
for(int m2=i2; m2>0;m2--)
System.out.print("*");
for(int j2=0; j2<temp2*2;j2++)
System.out.print(" ");
for(int k2=i2; k2>0;k2--)
System.out.print("*");
System.out.println();
temp2++;
}
}}

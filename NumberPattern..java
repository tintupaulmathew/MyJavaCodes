import java.io.*;
class NumberPattern
{
public static void main(String args[]){
int input=9;
int temp=input;
for (int i=0; i<=input; i++){
for (int j=temp; j>0; j-- )
System.out.print(" ");
for (int k=i; k>=0;k--)
System.out.print(k);
for(int l=1; l<=i;l++)
System.out.print(l);
System.out.println();
temp--;
}
}}

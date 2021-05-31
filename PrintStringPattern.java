import java.io.*;
class PrintingString{ 
public static void main(String args[]){
String str= "t&&1s#3d@@@7fw18", sub="", output="";
str+='#';
int no=0;
for(int index=0; index<str.length(); index++){
char c=str.charAt(index);
if((c<48||c>57)&&no!=0){
for(int k=0; k<no;k++)
output+=sub;
sub=Character.toString(c); 
no=0;
}
else if(c>=48&&c<=57)
{
int num=Character.getNumericValue(c);
no=no*10+num;
if(no==0)sub="";
}
else if(c<48||c>57)
sub+=c;
}
System.out.println(output);
}}

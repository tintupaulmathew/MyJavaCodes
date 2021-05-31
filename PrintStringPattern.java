import java.io.*;
class PrintingString{ 
public static void main(String args[]){
String str= "t&&1s#03d@@@7fw18a003", sub="", output="", no="";
str+='#';
for(int index=0; index<str.length(); index++){
char c=str.charAt(index);
if((c<48||c>57)&&no!=""){
int num=Integer.parseInt(no);
if(num==0) sub="";
for(int k=0; k<num;k++)
output+=sub;
sub=Character.toString(c); 
no="";
}
else if(c>=48&&c<=57)
{
no+=c;
}
else if(c<48||c>57)
sub+=c;
}
System.out.println(output);
}}



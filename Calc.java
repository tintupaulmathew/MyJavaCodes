import java.io.*;
class Calc
{
    public static void main(String args[])
   {
   String str="100*10-(40+20)", sub="";
   System.out.println(str);
  int start=0,end=0,index;
  char c=' ';
        while(true)
        {   
              for(index=0; index<str.length(); index++)
             {
             c=str.charAt(index);
                      if(c=='(')
                      {
                      start= index;
                      }
                      if(c==')')
                     {
                     end=index;
                     System.out.println("Solving bracket");
                     sub= str.substring(start+1,end); 
                     System.out.println(sub);
                     String str1= call(sub);
                     str=str.substring(0,start)+str1+str.substring(end+1,str.length());
                     System.out.println(str);
                     index=0;
                     }
            }
            String str2= call(str); 
            System.out.println("Output=\t"+str2);
           break;
       }
   }

   public static String call(String sub){
   if(sub.charAt(0)=='-')
sub=first_neg(sub);
int sub_index;
char ch=' ';

while(true){
for(sub_index=0; sub_index<sub.length(); sub_index++){
 if(sub.charAt(0)=='-')
sub=first_neg(sub);
ch=sub.charAt(sub_index);
if(ch=='*'||ch=='/')
switch(ch)
{
case '*':   
sub=solve(sub_index, sub, ch);
System.out.println(sub);
sub_index=0;
break;
case '/':
sub=solve(sub_index, sub, ch);
System.out.println(sub);
sub_index=0;
break;}}
for(sub_index=1; sub_index<sub.length(); sub_index++){
 if(sub.charAt(0)=='-')
sub=first_neg(sub);
ch=sub.charAt(sub_index);
if(ch=='+'|| ch=='-')
switch(ch){
case '+':
sub=solve(sub_index, sub, ch);
System.out.println(sub);
sub_index=0;
break;
case '-':
char c=' ';
sub=solve(sub_index, sub, ch);
System.out.println(sub);
sub_index=0;
break;
default:
break;
}}
if(sub_index==sub.length()) break;
}
return sub;
}

        

public static String solve(int sub_index, String sub, char ch){
int n1,n2,result=0,i,j, index;
String s1="", rev="", s2="", str="" ;
for(i=sub_index-1; i>=0; i--)
{
char c=sub.charAt(i);

if((c=='/')||(c=='+')||(c=='-')||(c=='*')) break;
s1+=c;
if(i==0) break;
}
for(index=s1.length()-1;index>=0;index--)
rev=rev+s1.charAt(index);
n1=Integer.parseInt(rev);
for (j=sub_index+1; j<sub.length();j++){
char c=sub.charAt(j);
if((c=='/')||(c=='+')||(c=='-')||(c=='*'))break;
s2+=c;
}
n2=Integer.parseInt(s2);
switch(ch){
case '*':
result=n1*n2;break;
case '/':
result=n1/n2;break;
case '+':
result=n1+n2;break;
case '-':
result=n1-n2;break;
}
if(i==0)
str=sub.substring(0,i)+result+sub.substring(j,sub.length());
else
str=sub.substring(0,i+1)+result+sub.substring(j,sub.length());
return str;
}

public static String first_neg(String sub)
{
int i,j,no1=0,no2=0,res=0, count=0;
char op=' ';
String str="",s1="", s2="";
for(i=1; i<sub.length(); i++){
char c=sub.charAt(i);
if(c=='/'||c=='+'||c=='-'||c=='*'){
count=1;    
op=c;
break;
}
s1+=c;
}
if (count==0) 
    return sub;
no1=Integer.parseInt(s1);
for(j=i+1; j<sub.length(); j++){
char c=sub.charAt(j);
if(c=='/'||c=='+'||c=='-'||c=='*') break;
s2+=c;
}
no2=Integer.parseInt(s2);
switch(op){
case '*':
res=-no1*no2;break;
case '/':
res=-no1/no2;break;
case '+':
res=-no1+no2;break;
case '-':
res=-no1-no2;break;
}
str= res+sub.substring(j, sub.length());
System.out.println(str);
return str;
}
} 

 

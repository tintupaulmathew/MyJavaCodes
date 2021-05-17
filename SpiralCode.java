import java.io.*;
class Spiral
{
public static void main(String args[])throws IOException
{
System.out.println("Enter a value\n");
BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(obj.readLine());
System.out.println("Generating matrix of\t"+n+"*"+n+"\n");
int array[][]= new int[n][n];
int middle = (n % 2 == 0) ? (n/2) -1 : n/2;
int a=0,n1=n, count=0;
while(a <= middle) {
for (int i=a; i<n; i++){
array[a][i]= ++count;
}
for(int j=(a+1);j<n;j++){
array[j][n-1]= ++count;
}
for(int k=(n-2);k>=a;k--){
array[n-1][k]= ++count;
}
for(int l=(n-2);l>a;l--){
array[l][a]= ++count;
}
n--;
a++;
}
for(int p=0;p<n1;p++)
{
for(int q=0;q<n1;q++)
{
System.out.print(array[p][q]+"\t");
}
System.out.println("\n");
}
}
}

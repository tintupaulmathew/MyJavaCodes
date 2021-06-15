class triplet
{
public static void main(String args[])
{
int a[]={9,8,20,3,4,-1,0,10,15};
int sum=0, large=0, count=3, size=a.length,i;
while(count>0){
large=a[0];
for(i=0;i<size;i++)
{
if(a[i]>large)
{
large=a[i];
}
}
System.out.println(large);
sum+=large;
for(int j=0;j<size;j++)
{
if(a[j]==large){
for(int l=j;l<size-1;l++)
{
a[l]=a[l+1];
}}}
size=size-1;
count--;
}
System.out.println(sum);
}}

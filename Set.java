import java.io.*;
class Set
{
public static void main(String args[])
	{
	int a[]={10,2,1000,4,216,64,8, 125, 5, 3,27,1,1,6};
	int size=a.length;		
	int res[]=new int[size];
	int pos=0, counter=size/2;
	while(counter>0)
		{
		int small=a[0];
		for(int i=1;i<size;i++)
			{
			if(a[i]<small)
				{
				small=a[i];
				}
			}
		int cube=small*small*small;
		res[pos++]=small;
		res[pos++]=cube;
		for(int j=0;j<size;j++)
			{
			if(a[j]==small){
				for(int l=j;l<size-1;l++)
				{
				a[l]=a[l+1];
				}
				break;
 			}}
 			size=size-1;
		for(int j=0;j<size;j++){
 			if(a[j]==cube)
				{
				for(int l=j;l<size-1;l++)
				{
				a[l]=a[l+1];
				}
				break;
			}}
		size=size-1;
		counter--;
		}
	for(int k=0;k<res.length;k++)
	{
		System.out.print(res[k]+ "\t");
	}
}
}
class Second_Largest
{
public static void main(String args[])
{
	int a[]={9,1,7,3,6,5,8};
	int max1=-1, max2=-1;
	for(int i=0; i<a.length;i++)
		{
		if(a[i]>max1)
			{
			max2=max1;
			max1=a[i];
			}
		else if(a[i]>max2)
			{
			max2=a[i];
			}
		}
System.out.println(max2);
}
}
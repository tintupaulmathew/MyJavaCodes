/* Fibonacci Series 0 1 1 2 3 5 8 13 21 34 55 89 ... Check if an array is a sub series of fibonacci series
eg:
input array : 13, 21, 34, 55, 89
output : its a valid fibonacci series
inp;ut array : 34, 55, 88
output : it's not a valid fibonacci series */

class Fibo_Series
{
public static void main(String args[])
	{
	int a[]={1,2,3,5,8,13};                  //eliminate the zero one default elements
	int num1=0, num2=1, sum=0;
	boolean check= true;
	while(true)
		{
		if(sum==a[0])
			break;
		sum=num1+num2;
		num1=num2;
		num2=sum;
		}
	for(int i=0; i<a.length; i++)
		{
		if(a[i]==sum)
			{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			}
		else
			{
			check= false;
			break;
			}
		}
	if(check==true)
		System.out.println("It's a valid fibonacci series");
	else
		System.out.println("Not a valid fibonacci series");	
	
	}
}
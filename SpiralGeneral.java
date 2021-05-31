class Spiralgeneral
{
public static void main(String args[])
{
int no_of_rows=10, no_of_columns=6;
System.out.println("Generating matrix of\t"+no_of_rows+"*"+ no_of_columns);
int array[][]= new int[ no_of_rows][ no_of_columns];
int a=0, m=no_of_rows, n=no_of_columns, count=0;
int small_value= (no_of_rows<no_of_columns)? no_of_rows : no_of_columns;
int middle= (small_value%2==0)? (small_value/2)-1 : small_value/2 ;
while(a<=middle){
for (int top_row=a; top_row<no_of_columns; top_row++){
if(count==(m*n)) break;
array[a][top_row]= ++count;
System.out.println("Array["+a+"]["+top_row+"]=\t"+array[a][top_row]+"\t");
}
for(int right_col=(a+1);right_col<no_of_rows;right_col++){
if(count==(m*n)) break;
array[right_col][no_of_columns-1]= ++count;
System.out.println("Array["+right_col+"]["+(no_of_columns-1)+"]=\t"+array[right_col][no_of_columns-1]+"\t");
}
for(int bottom_row=(no_of_columns-2);bottom_row>=a;bottom_row--){
if(count==(m*n)) break;
array[no_of_rows-1][bottom_row]= ++count;
System.out.println("Array["+(no_of_rows-1)+"]["+bottom_row+"]=\t"+array[no_of_rows-1][bottom_row]+"\t");
}
for(int left_col=(no_of_rows-2);left_col>a;left_col--){
if(count==(m*n)) break;
array[left_col][a]= ++count;
System.out.println("Array["+left_col+"]["+a+"]=\t"+array[left_col][a]+"\t");
}
 no_of_rows--;
 no_of_columns--;
a++;
}
System.out.println("Output\n");
for(int p=0;p<m;p++)
{
for(int q=0;q<n;q++)
{
System.out.print(array[p][q]+"\t");
}
System.out.println("\n");
}
}
}

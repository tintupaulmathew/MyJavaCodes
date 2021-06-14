import java.io.*;
class SudokoNew
{
public static void main(String args[])
      {
      int a[][]={{ 1,7,2,5,4,9,6,8,3},                              
	     {6,4,5,8,7,3,2,1,9},
	    {3 ,8,9,2,6,1,7,4,5},
	    {4,9,6,3,2,7,8,5,1},
	    {8,1,3,4,5,6,9,7,2},
	   {2,5,7,1,9,8,4,3,6},
	   {9,6,4,7,1,5,3,2,8},
	   {7,3,1,6,8,2,5,9,4},
	   {5,2,8,9,3,4,1,6,7}};
                        boolean check=true;
                        int row_len=a.length;
                        int col_len=a[0].length;
                       for(int r=0;r<row_len;r++)                            //checking row-wise
                                           {
		 boolean row[]= new boolean[row_len];
                                           for(int c=0;c<col_len;c++)
                                                               { 
			if( row[(a[r][c])-1]==false)
   			{
                                                                row[(a[r][c])-1]=true;
			}
			else
			{
			check=false;
			System.out.println("Invalid Sudoko");
                    			break;
                                                                }}
                                        }
                     for(int r=0;r<row_len;r++)                             //checking column-wise
                                        {
                                        if(check==false)
                                       {
                                        break;
                                       }
		boolean col[]= new boolean[col_len];
                                      for(int c=0;c<col_len;c++)
                                                            { 
                                                            if(col[(a[c][r])-1] ==false)
			{
			col[(a[c][r])-1]=true;
                                                            } 
                                        		else
			{
			check=false;
			System.out.println("Invalid Sudoko");
			break;
			}}
                                       }
                     int box_size=(int)Math.sqrt(row_len);      //3
                     
                      for(int r=0;r<a.length; r=r+3)                        //checking box-wise
                       { 
                                        if(check==false)
                                        {
                                        break;
                                        }
                                       for(int c=0;c<a.length;c=c+3)
                                                      {   
			boolean box[]= new boolean[a.length];
                                                                  for(int i=r; i<box_size;i++)
                                                                                 {
                                                                                         for(int j=c;j<box_size; j++)
                                                                                                       {
                                                                                                      if( box[(a[i][j])-1]== false)
					{
					box[(a[i][j])-1]=true;
					}
  					else
					{
					check=false;
			 		System.out.println("Invalid Sudoko");
					break;
					}
                                                                                                       }
                                                                                 }
                                                   }
                          }
                         if(check==true)
                         {
                         System.out.println("Valid Sudoko");
                         }
                        }                                             
}
package july7;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter value of a :"); 
		int a=sc.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{  for(int x=a-i;x>=0;x--)
		{
			System.out.print(" ");
		}
			for(int j=0;j<i;j++)
			{
				if(j==0||j==i)
				{
					arr[i][j]=1;
				}
				else
				{
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			   System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
    
	}

}

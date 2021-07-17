import java.util.Scanner;

public class Homework1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Please input the row of the pyramid:\t");
		int row = in.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int space=1;space<=row-i;space++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
//第二次修改

import java.util.Scanner;
public class Homework2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year:(e.g., 2012):");
		int year = in.nextInt();
		System.out.print("Enter month 1-12:");
		int month = in.nextInt();
		System.out.print("Enter the day of the month 1-31:");
		int q = in.nextInt();
		int k = year % 100;
		int m,h,j;
		if(month == 1)
			m = 13;
		else if(month == 2)
			m = 14;
		else
			m = month;
		j = year / 100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		switch (h)
		{
			case 0:System.out.print("Saturday");break;
			case 1:System.out.print("Sunday");break;
			case 2:System.out.print("Monday");break;
			case 3:System.out.print("Tuesday");break;
			case 4:System.out.print("Wednesday");break;
			case 5:System.out.print("Thursday");break;
			case 6:System.out.print("Friday");break;
		}
	}
}
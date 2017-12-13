/**This program will create a seating chart and sell each ticket based
 on the row/column or price.
 @author Tianchen Liu
 
 Sample output:
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20 30 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50 50 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
s
Enter the row and seat number you want: 
2 2
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50 50 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
s
Enter the row and seat number you want: 
1 8
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
p
What price do you want to buy?
10
  0 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
p
What price do you want to buy?
20
  0 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10  0 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
s
Enter the row and seat number you want: 
2 2
Sorry, seat already occupied.
  0 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10  0 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
s 
Enter the row and seat number you want: 
20 40
Sorry, invalid row.
  0 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10  0 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
p
What price do you want to buy?
5
Sorry, no seat found with that price.
  0 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10 10 10 10 10 10 10 10 10
 10 10  0 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 10 10 20 20 20 20 20 20 10 10
 20 20 30 30 40 40 30 30 20 20
 20  0 30 40 50 50 40 30 30 20
 30 40 50 50 50 50 50  0 40 30
Pick by (s)eat or (p)rice or (q) to quit: 
q
 * 
 */

import java.util.*;
public class SeatingChart
{	
	public static int[][] seats = {
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
        { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
        { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };
	
	public static void main(String args[])
	{
		displayChart();			
	}
	
	public static void displayChart()
	{
		//Display current seating chart.
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(String.format("%3d", seats[i][j]));
			}
			System.out.println();
		}
		repeat(); //Repeat until exit.
	}
	
	public static void chooseSeat() //Choose seat based on location.
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the row and seat number you want (separated by space):");
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		if (i > 9 || j > 10 || i <= 0 || j <= 0)
		{
			System.out.println("Sorry, invalid row or seat.");
			displayChart();
		}
		
		else if (seatTaken(9 - i, j - 1) == true)
		{
			System.out.println("Sorry, seat already occupied.");
			displayChart();
		}
		
		seats[9 - i][j - 1] = 0;
		displayChart();
		repeat();
	}
	
	public static void choosePrice() //Choose seat based on price.
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("What price do you want to buy?");
		int price = scan.nextInt();
		if (price == 0 || priceTaken(price))
		{
			System.out.println("Sorry, no seat found with that price.");
			displayChart();
		}	
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (price == seats[i][j])
				{
					seats[i][j] = 0;
					i = 10;
					j = 11;
				}
			}
		}
		displayChart();		
		repeat();
	}
	
	public static void exit() //Exit the program.
	{
		System.exit(1);
	}
	
	public static boolean seatTaken(int a, int b) //Check if seat's taken.
	{
		boolean taken = false;
		if (seats[a][b] == 0)
			taken = true;
        return taken;
	}
	
	public static boolean priceTaken(int price) //Check if that price is available.
	{
		boolean taken = true;
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (price == seats[i][j])
				{
					taken = false;
					i = 10;
					j = 11;
				}
			}
		}
		return taken;
	}
	
	public static void repeat() //Repeat the buying.
	{
		Scanner scan = new Scanner (System.in);		
		System.out.println("Pick by (s)eat or (p)rice or (q) to quit:");
		char input = scan.nextLine().charAt(0);
		if (input == 's')
			chooseSeat();
		else if (input == 'p')
			choosePrice();
		else if (input == 'q')
			exit();
	}
	
	
}
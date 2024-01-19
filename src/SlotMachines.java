import java.util.Scanner;



public class SlotMachines {
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		int playcounter = 0;
		
		int quarters = scan.nextInt(); 
		
		int cas1 = scan.nextInt(); 
		int cas2 = scan.nextInt(); 
		int cas3 = scan.nextInt(); 

		
		while (quarters > 0)
		{
			
			cas1++;
			quarters--;
			playcounter++; 

			if (quarters <= 0)
			{
				break;
			}

			
			if (cas1 == 35)
			{
				quarters += 30;
				cas1 = 0; 
			}
			
			cas2++;
			quarters--;
			playcounter++; 
			if (quarters <= 0)
			{
				break;
			}
			
			if (cas2 == 60)
			{
				quarters += 60;
				cas2 = 0;
			}
			
			cas3++;
			quarters--;
			playcounter++; 
			if (quarters <= 0)
			{
				break;
			}

			
			if (cas3 == 10)
			{
				quarters += 9;
				cas3 = 0; 
			}
			
			
			
			
			
		}
		
		
		System.out.print("Martha plays " + playcounter + " times before going broke.");
		
		
		scan.close(); 
		
	
	}
}

package HUB;

import java.io.IOException;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
			int n = 0;
			int s=0;
			int t = n;
			System.out.print("Please enter number: ");
			n= input.nextInt();
			while(n>0) 
			{
				int i = n%10;
				s=s*10+i;
				n=n/10; 
			}
            if(t==s)
			 {
					System.out.println("given number is prime");
		     }
			else
				{
					System.out.println(" not given number is prime");
				}
			}

	}



package hello;

import java.util.Scanner;

public class Week701 {
	
	public static void Fac(int a)
	{
		boolean isPrime = true;
		for(int i=2; i<a; i++)
		{
			if(a % i ==0)
			{
				isPrime = false;
				System.out.print(i+"x");
				Fac(a/i);
				break;
			}
		}
		if(isPrime)
		{
			System.out.print(a);	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer factorization
		Scanner in = new Scanner(System.in);
		int Num = in.nextInt();
		Fac(Num);
	}

}

package hello;

import java.util.Scanner;

public class Week401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum between the n_th and m_th prime
		// including the n_th and the m_th
		int count =1;
		int n;
		int m;
		int x=2;
		int sum = 0;
		boolean isPrime = true;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		while(count<n)
		{
			 
			for(int i=2; i<x; i++)
			{
				if(x%i==0)
				{
					isPrime = false;
					break;
				}
				
			}
			if(isPrime)
			{
				count +=1;
			}
			isPrime = true;
			x += 1;
		}
		while(count>=n && count<=m)
		{
			if(n == 1)
			{
				sum = 2;
			}
			for(int i=2; i<x; i++)
			{
				if(x%i==0)
				{
					isPrime = false;
					break;
				}
				
			}
			if(isPrime)
			{
				sum += x;
				count +=1;
			}
			isPrime = true;
			x += 1;
		}
		System.out.println(sum);
		
	}

}

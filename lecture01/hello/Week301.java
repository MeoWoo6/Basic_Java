package hello;

import java.util.Scanner;

public class Week301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int odd = 0;
		int even = 0;
		x = in.nextInt();
		while(x != -1)
		{
			if (x%2==0)
			{
				even +=1;
			}
			else
			{
				odd +=1;
			}
			
			x = in.nextInt();
		}
		System.out.println(odd+" "+even);
	}

}

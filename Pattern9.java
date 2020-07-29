package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space1 = 0;
		int space2 = n-2;
		
		for(int i=1; i<=(n/2)+1; i++) {
			for(int j=1; j<=space1; j++) 
				System.out.print("\t");
			System.out.print("*\t");
			for(int k=1; k<=space2; k++)
				System.out.print("\t");
			if(i!=(n/2)+1)
			System.out.println("*\t");
			space1++;
			space2 -= 2;
		}System.out.println();
		space1 = (n/2)-1;
		space2 = 1;
		for(int i=1; i<=n/2; i++) {
			for(int j=1; j<=space1; j++)
				System.out.print("\t");
			System.out.print("*\t");
			for(int k=1; k<=space2; k++)
				System.out.print("\t");
			System.out.print("*\t");
			space1--;
			space2 += 2;
			System.out.println();
		}

	}

}

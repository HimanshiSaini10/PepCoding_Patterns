package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int spaceB = 1;
		int spaceIn = n-4;
		
		for(int i=0; i<n; i++)
			System.out.print("*\t");
		System.out.println();
		
		for(int i=0; i<n/2 - 1; i++) {
			for(int j=0; j<spaceB; j++)
				System.out.print("\t");
			spaceB++;
			System.out.print("*\t");
			for(int j=0; j<spaceIn; j++)
				System.out.print("\t");
			spaceIn -= 2;
			System.out.print("*\t");
			System.out.println();
		}
		
		for(int i=0; i<n/2 + 1; i++) {
			for(int j=0; j<spaceB; j++)
				System.out.print("\t");
			spaceB--;
			for(int j=0; j<2*(i+1)-1; j++)
				System.out.print("*\t");
			System.out.println();
		}

	}

}

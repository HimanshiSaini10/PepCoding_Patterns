package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/2; j++)
				System.out.print("\t");
			for(int j=0; j<=i; j++)
				System.out.print("*\t");
			System.out.println();
		}
		
		for(int i=0; i<1; i++)
			for(int j=0; j<n; j++)
				System.out.print("*\t");
		System.out.println();
		
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/2; j++)
				System.out.print("\t");
			for(int j=0; j<(n/2)-i; j++) 
				System.out.print("*\t");
			System.out.println();
		}

	}

}

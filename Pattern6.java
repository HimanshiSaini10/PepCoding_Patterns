package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int stars = (n/2)+1;
		int space = 1;
		
		for(int i=0; i<(n/2)+1; i++) {
			for(int j=0; j<stars; j++) {
				System.out.print("*\t");
			}
			for(int k=0; k<space; k++) {
				System.out.print("\t");
			}
			for(int j=0; j<stars; j++) {
				System.out.print("*\t");
			}
			stars--;
			space+=2;
			System.out.println();
		}
		
		stars = 2;
		space = n-2;
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<stars; j++) {
				System.out.print("*\t");
			}
			for(int k=0; k<space; k++) {
				System.out.print("\t");
			}
			for(int j=0; j<stars; j++) {
				System.out.print("*");
				if(!(i==(n/2)-1 && j==stars-1))
				System.out.print("\t");
			}
			space-=2;
			stars++;
			if(i!=(n/2)-1)
			System.out.println();
		}

	}

}

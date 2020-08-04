package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = (2 * n) - 3;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1 + "\t");
			}
			for(int j=0; j<space; j++) {
				System.out.print("\t");
			}
			int k = (i==n-1)?n-1:i + 1;
			for(int j=0; j<=i; j++) {
				if(i==n-1 && j==i)
					continue;
				System.out.print(k + "\t");
				k--;
			}
			space-=2;
			System.out.println();
		}

	}

}

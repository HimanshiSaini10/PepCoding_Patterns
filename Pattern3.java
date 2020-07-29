package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print("\t");
			}
			for(int k=n-i-1; k<n; k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}

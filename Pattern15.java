package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n/2;
		
		for(int i=1; i<=n/2+1; i++) {
			int val = i-1;
			for(int j=1; j<=space; j++)
				System.out.print("\t");
			space--;
			for(int j=0; j< 2*i - 1; j++) {
				if( j <= (2*i - 1)/2) {val++;
					System.out.print(val +"\t");
					 }
				else { val--;
					System.out.print(val + "\t");
					 }
				}
			System.out.println();
		}
		space = 1;
		int k = n-2;
		for(int i=1; i<=n/2; i++) {
		int val = n-(n/2+1) - i;
			for(int j=1; j<=space; j++)
				System.out.print("\t");
			space++;
			
			for(int j=1; j<=k; j++) {
				if( j <= k/2+1) {val++;
				System.out.print(val +"\t");
				 }
			else { val--;
				System.out.print(val + "\t");
				 }
			}
			k-=2;
			System.out.println();
		}
	}

}

package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space1 = n/2;
		int space2 = 1;
		
		for(int i=1; i<=(n/2)+1; i++) {
			for(int j=1; j<=space1; j++)
				System.out.print("\t");
			System.out.print("*\t");
			if(i!=1) {
				for(int k=1; k<=space2; k++)
					System.out.print("\t");
				System.out.print("*\t");
				space2 += 2;
			}
			space1--;
			System.out.println();
		}
		
		space1 = 1;
		space2 = n-4;
		for(int i=1; i<=n/2; i++) {
			for(int j=1; j<=space1; j++)
				System.out.print("\t");
			System.out.print("*\t");
			for(int k=1; k<=space2; k++)
				System.out.print("\t");
			if(i!=n/2)
			System.out.print("*\t");
			space1++;
			space2 -= 2;
			System.out.println();
		}

	}

}

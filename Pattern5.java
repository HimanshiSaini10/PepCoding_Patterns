package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int space = n/2;
		for(int i=1; i<=(n/2)+1; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("\t");
			}
			space--;
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		space = 1;
        for (int j=1; j<=n/2; j++) 
        {
            for (int i=1; i<=space; i++) 
            {
                System.out.print("\t");
            }
            space++;
            for (int i=0; i<n-(2*j); i++) 
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }

	}

}

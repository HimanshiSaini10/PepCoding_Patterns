package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++,h++) {
				System.out.print(h+"\t");
			}
			System.out.println();
		}

	}

}

package pepCoding_Pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;
		int total = 0;
		while(a>0) {
			total += a;
			a--; }
		int arr[] = new int[total];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<total; i++)
			arr[i] = arr[i-1] + arr[i-2];
		
		for(int i=0,k=0; i<n; i++) {
			for(int j=0; j<=i&&k<total; j++,k++) {
				System.out.print(arr[k] + "\t");
			}
			System.out.println();
		}

	}

}

package patterns;

import java.util.Scanner;

public class A_4Pyramid {
	
		public static void triangle(int n) {
			
			for(int i=n;i>=1;i--) {
				
			
				for(int s=1;s<=2*i;s++) {
					System.out.print(" ");
				}

				for(int j=i;j<=n;j++) {
					System.out.print(j+" ");
				}

				for(int j=n-1;j>=i;j--) {
					System.out.print(j+" ");
				}
				System.out.println();
				
			}
			
			
		}

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the rows:");
			int rows=in.nextInt();
			
			triangle(rows);

		}

	}

package patterns;

import java.util.Scanner;

public class A_1Pyramid {
	
	public static void triangle(int rows) {
	
		for(int i=1;i<=rows;i++) {
			for(int space=rows-i;space>=1;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		
		triangle(rows);

	}

}

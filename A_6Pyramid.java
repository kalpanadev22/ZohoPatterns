package patterns;

import java.util.Scanner;

public class A_6Pyramid {
	public static void triangle(int rows,char symbol) {
		for(int i=1;i<=rows;i++) {
			
			for(int space=rows-i;space>=1;space--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(symbol+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		 System.out.println("Enter the char:");
		    char symbol=in.next().charAt(0);
		
		triangle(rows,symbol);

	}

}
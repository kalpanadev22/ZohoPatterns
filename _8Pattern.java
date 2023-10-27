package patterns;

import java.util.Scanner;

public class _8Pattern {

	public static void triangle(int rows,char symbol) {
		for(int i=1;i<rows;i++) {
		
			for(int j=1;j<=rows;j++) {
				if(i+j==rows+1|| j==5) {
				System.out.print(symbol);
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		for(int i=rows;i>=1;i--) {
			
			for(int j=1;j<=rows;j++) {
				if(i+j==rows+1 || j==5) {
				System.out.print(symbol);
			}
				else {
					System.out.print(" ");
				}
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
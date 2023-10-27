package patterns;

import java.util.Scanner;

public class _9Pattern {

	public static void pattern(int rows,char ch) {
	//first half	
	for(int i=rows;i>1;i--) {
		
		for(int j=1;j<rows;j++) {
			if(i==j ) {
			System.out.print(ch);
		}
		
			else {
				System.out.print(" ");
			}
		}
			
		
		// secondo half
			for(int j=1;j<=rows;j++) {
				if(i+j==rows+1) {
				System.out.print(ch);
			}
	
				else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
	//first half	
	for(int i=1;i<=rows;i++) {
		
		for(int j=1;j<rows;j++) {
			if( i==j ) {
			System.out.print(ch);
		}
		
			else {
				System.out.print(" ");
			}
		}
			
		
		// secondo half
			for(int j=1;j<=rows;j++) {
				if( i+j==rows+1) {
				System.out.print(ch);
			}
	
				else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
}


public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the rows:");
	int rows=in.nextInt();
	 System.out.println("Enter the char:");
	    char symbol=in.next().charAt(0);
	
 pattern(rows,symbol);

}

}
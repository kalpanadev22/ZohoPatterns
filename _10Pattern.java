package patterns;

import java.util.Scanner;

public class _10Pattern {
	
	public static void pattern(int rows,char ch) {
		
		// first half
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+1-i;j++) {
				
				System.out.print(ch);
			}
			
			for(int s=1;s<=2*i-2;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows+1-i;j++) {
				System.out.print(ch);
			}
				
			
				System.out.println();
			}
		
			//second half
		
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows+1-i;j++) {
				
				System.out.print(ch);
			}
			
			for(int s=1;s<=2*i-2;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows+1-i;j++) {
				System.out.print(ch);
			}
				
			
				System.out.println();
			}
			
		}
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		System.out.println("Enter the symbol");
		char ch=in.next().charAt(0);
		
		pattern(rows,ch);
	}

}

package patterns;

import java.util.Scanner;

public class _6Pattern {
	
	public static void pattern(int rows,char ch) {
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=rows;j++) {
				if(  i+j==rows || i==5){
				
				System.out.print(ch);
			}
				else {
					System.out.print(" ");
				}
			}
		
		for(int j=1;j<rows;j++) {
				if(   i==1 || i+j==rows){
				
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
		System.out.println("Enter the symbol");
		char ch=in.next().charAt(0);
		
		pattern(rows,ch);
	}

}
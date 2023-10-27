package patterns;

import java.util.Scanner;

public class _11Pattern {

	
	public static void pattern(int rows,char ch) {
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
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

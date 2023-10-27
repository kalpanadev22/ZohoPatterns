package patterns;

import java.util.Scanner;

public class A_3Pyramid {



	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		 System.out.println("Enter the char:");
		    char symbol=in.next().charAt(0);
		
		    for(int i=rows;i>1;i--) {
				
				for(int space =i;space<=rows;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<i;j++) {
					System.out.print(symbol+" ");
				}
				System.out.println(" ");
			}

	}

}

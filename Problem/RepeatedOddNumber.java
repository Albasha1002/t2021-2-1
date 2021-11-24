package Problem;

import java.util.Scanner;

public class RepeatedOddNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("input a = ");
		int a=in.nextInt();
		
		
		if(a%2!=0) {
			
		   for(int i=0;i<=2*a;i++) {
			
			   if(i%2!= 0) {
			   
					System.out.print(i+" ");
				}
		    }
		   
		}else {
			for(int i=1;i<2*a-1;i++) {
				
				if(i%2!=0) {
					
				      System.out.print(i+" ");
				 }
			 }
		
		  }
	}
	}



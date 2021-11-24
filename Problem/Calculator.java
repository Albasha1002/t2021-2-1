package Problem;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double ans=0;
		
		while(true) {
			System.out.println(">");
			
			double a=in.nextDouble();
			double b=in.nextDouble();
			String op=in.next();
			char ch=op.charAt(0);
			
			
			  if((ch == '+') ||(ch == '-') || (ch == '*') || (ch =='/') || (ch == '%')) {
			  
			  if(ch=='+') { ans=a+b; } if(ch=='-') { ans=a-b; } if(ch=='/') { if(b!=0) { ans=a/b; } }
			  if(ch=='%') { ans=a%b; }
			  if(ch=='*') { ans=a*b; } 
			  }
			  else if(ch== 'x' || ch== 'X') { break;
			  }else { System.out.println("Invalid Operator"); }
			  
			 
			System.out.println(ans);
}
		

	}

}

import java.util.Scanner;
public class math{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		//  "+" this operator is known as concatination for two string 
		System.out.println("the calculative values is "+c);
		// this is for the increament operators 
		// a++;
		a+=5;
		System.out.println(a);



	}
}
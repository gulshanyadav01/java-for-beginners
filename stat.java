import java.util.Scanner;
public class stat{
	public static void main(String[] args){
		account acc =new account();
		System.out.println("enter what you want to do");
		System.out.println("enter 1 open account");
		System.out.println("enter 2 for deposite amount");
		System.out.println("enter 3 for withdrawl of amount");

		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice){
			case 1:
			acc.setname("gulshan");
			System.out.println("name"+acc.getname());
			break;

			case 2:
			acc.setbalance(1000);
			System.out.println("balance=="+acc.getbalance());


			case 3:
			acc.setwbalance(300);
			System.out.println("balance="+acc.getwbalance());

		}

	}
}
import java.util.Scanner;
public class conditional{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the score of students");
	int score=scan.nextInt();
	switch(score){
		case 95:
		System.out.println("you get 5 marks");
		break;
		case 90:
		System.out.println("you get 4 marks ");
		break;
		case 85:
		System.out.println("you get 3 marks ");
		break;
		case 80:
		System.out.println("you get 2 marks ");
		break;
		case 75:
		System.out.println("you get 1 marks ");
		default:
		System.out.println("you get nothing maze lo");
		break;
	}


}
}
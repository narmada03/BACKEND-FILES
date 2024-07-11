import java.util.Scanner;
class Studentdetails{
	public static void main(String[]args){
		Scanner details=new Scanner(System.in);
		System.out.println("enter your name");
		String name=details.nextLine();
		System.out.println("enter your age");
		String age=details.nextLine();
		System.out.println("enter your address");
		String address=details.nextLine();
		System.out.println("enter your marks");
		String marks=details.nextLine();
		System.out.println("your name is:"+name+ "your age is:"+age+ "your address:"+address+ "your marks are:"+marks);
	}	
}	
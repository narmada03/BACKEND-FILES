import java.util.Scanner;
class ScannerDemo{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scanner.nextInt();
		System.out.println("enter second number");
		int num2=scanner.nextInt();
		int sum=num1+num2;
		System.out.println("The first num is:"+num1+  "The second num is:"+num2+ "The sum is:"+sum);
	}	
}	
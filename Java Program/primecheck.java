import java.util.Scanner;

public class primecheck {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter a number:");
		int num=scanner.nextInt();

		Boolean isPrime=true;

		if(num <= 1) {
			isPrime=false;
		} else {
			for(int i =2; i <= num/2; i++) {
				if(num % i == 0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num + " is a Prime number ");
		}else{
			System.out.println(num + " is not a Prime number ");
		}
	}
}

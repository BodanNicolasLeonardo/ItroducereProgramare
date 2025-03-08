
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		System.out.println("Ex1:\n");

		Scanner inputObj = new Scanner(System.in);
		System.out.println("scrie un numar: ");
		int n1 = inputObj.nextInt();
		if(n1 >= 1 && n1 <= 10)
			if(n1 > 5)
				System.out.println("ADMIS\n");
			else
				System.out.println("RESPINS\n");
		else
			System.out.println("INVALID\n");

		inputObj.close();
	}

}
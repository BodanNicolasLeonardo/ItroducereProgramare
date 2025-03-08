import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Ex4:\n");
		System.out.println("scrie 3 numere: ");
		int n1 = inputObj.nextInt();
		int n2 = inputObj.nextInt();
		int n3 = inputObj.nextInt();
		if((n1 <= n2) && (n2 <= n3))
			System.out.println(n1);
		else if((n2 <= n1) && (n1 <= n3))
			System.out.println(n2);
		else
			System.out.println(n3);
		
		System.out.println("\n");
		
		inputObj.close();
	}

}
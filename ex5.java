import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Ex5:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int sum = 0;
		int i;
		for(i = 0; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");

		inputObj.close();
	}

}
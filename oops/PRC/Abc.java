// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

public class Abc {

	static int a = 5;

	// static {
	// 	a = 10;
	// 	System.out.println("Executed Static Block");
	// }

	// static {
	// 	System.out.println("Executed block 2");
	// }

	public static void main(String[] args) {
		// double a, b;
		// a = 10;
		// b = 12;
		// System.out.println("a = " + a);
		// double c = a / b;
		// System.out.println("Sum = " + c);

		// String s = args[0];
		// System.out.println(s);
		// System.out.println(args[1]);
		// System.out.println(args[2]);
		// int a = 10, b = 3;
		// int c = b++ + ++a;
		// System.out.println(c);
		// System.out.println(b);

		/* Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		try {
			int j = 5 / 0;
			x = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		// int x = sc.nextInt();
		System.out.println(x);

		while(true) {
			System.out.println("Ok");
			break;
		}

		sc.close(); */



		// System.out.println(a);

		int a = 5;
		if((a & 1) == 0) {
			System.out.println("Even");
		}
		else if((a & 1) == 1) {
			System.out.println("Odd");
		}
	}
}

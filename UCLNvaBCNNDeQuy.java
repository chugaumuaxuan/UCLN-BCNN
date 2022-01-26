package DeQuy;

import java.util.Scanner;

public class UCLNvaBCNNDeQuy {
	

	
	public static int uocchung(int a, int b) {
		if(b == 0) {	// dieu kien thoat khoi de quy
			return a;
		}
		return uocchung(b, a%b); // goi de quy
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap vao so a: ");
		 int a = sc.nextInt();
		 System.out.println("Nhap vao so b: " );
		 int b = sc.nextInt();
		
		System.out.println("Uoc chung lon nhat la " + uocchung(b, a%b));
		sc.close();
	}
}

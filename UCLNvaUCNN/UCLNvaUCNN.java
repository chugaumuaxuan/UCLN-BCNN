package UCLNvaUCNN;

import java.util.Scanner;

public class UCLNvaUCNN {
	int a;
	int b;
	int UCLN =1;
	int min;
	int BCNN;
	
	
	
	public void TimUCLN(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		int b = sc.nextInt();
		sc.close();
				
		if (a > b) {
			min = a%b;
		}else {
			min = b%a;
		}
		if( a%b == 0 ) {
			UCLN = b;
		}else if (b%a == 0) {
			UCLN = a;
		}
		
		for(int i = 1; i <= min; i++) {
			 if((a%b) % i == 0 && (b%a) % i == 0) {
				UCLN = i;
			}
		}
		
		BCNN = (a*b) / UCLN ;
	}
	
	public void display() {
		
		System.out.println("Uoc chung lon nhat cua a va b la: " + UCLN);
		System.out.println("Boi chung nho nhat cua a va b la: " + BCNN);
	}
	
	
	
	
}

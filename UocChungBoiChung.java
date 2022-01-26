package VongLapFor;

import java.util.Scanner;

public class UocChungBoiChung {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao so a: " );
	int a = sc.nextInt();
	System.out.println("Nhap vao so b: " );
	int b = sc.nextInt();
	int uocchung = 1;
	int boichung = (a*b) / uocchung;
	
	
	if(a >= b && b != 0) {
	for(int i = 1; i <= (a%b) && i <= b; i ++) {
		if((a%b) % i == 0 && b % i == 0) {
				uocchung = i;
			}
		}
		
		System.out.println("Uoc chung lon nhat cua a va b la: " + uocchung);
		System.out.println("Boi chung nho nhat la: "+boichung);
	}
	else if( a <= b && a != 0 ){
		for(int i = 1; i <= (b%a) && i <= b; i ++) {
			if((b%a) % i == 0 && b % i == 0) {
					uocchung = i;
				}
			}
		System.out.println("Uoc chung lon nhat cua a va b la: " + uocchung);
		System.out.println("Boi chung nho nhat la: "+boichung);
	}
	else if(a == 0) {
		System.out.println("Boi chung nho nhat la 0, Uoc chung lon nhat la :" + b);
	}else if(b == 0) {
		System.out.println("Boi chung nho nhat la 0, Uoc chung lon nhat la :" + a);
	}
	else if(a == 0 && b == 0){
		System.out.println("khong co uoc chung va boi chung");
	}
	sc.close();
	}
}


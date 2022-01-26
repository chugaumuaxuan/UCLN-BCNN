package VongLapFor;

public class UocChungBoiChung {
	
	public static void main(String[] args) {
	int a = 20;
	int b = 16;
	int uocchung = 1;
	int boichung = (a * b) / uocchung;
	
	for(int i = 1; i <= a && i <= b; i ++) {
		if(a % i == 0 && b % i == 0) {
				uocchung = i;
			}
		System.out.println("Uoc chung lon nhat cua a va b la: " + uocchung);
		}
	System.out.println("Boi chung lon nhat la: "+boichung);
	
	}
}

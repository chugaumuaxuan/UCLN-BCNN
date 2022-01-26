package VongLapWhile;

public class UCLNvaBCNNwhile {
	public static void main(String[] args) {
		int a = 30;
		int b = 6;
		while( a != b) {
			if(a > b) {
				a = a - b ;
			}else {
				b = b - a;
			}
		}
		System.out.println("Uoc chung lon nhat la: " + a);	
	}
}

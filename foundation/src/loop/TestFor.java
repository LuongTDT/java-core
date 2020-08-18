package loop;

public class TestFor {
	
	public static double CalculateS (int x, int n) {
		double s = 0.0;
		double tu = 0.0;

		int mau = 0;
		
		for (int i = 1; i <= n; i++) {
			tu = Math.pow(x, i);
			mau = mau + i;
			s = s + tu/mau;
		}
		return s;
	}
	
	public static void VeHinh(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(CalculateS(2, 3));
		VeHinh(10);
	}

}

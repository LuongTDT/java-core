package Test;

public class SoNguyenTo {
	public static void main(String[] args) {
		SoNguyenTo nguyenTo = new SoNguyenTo();
		System.out.println(nguyenTo.IsSNT(24));
		
		for (int i = 0; i < 1000; i++) {
			if (nguyenTo.IsSNT(i)) {
				System.out.print(i+", ");
			}
		}
	}
	
	public boolean IsSNT(int number) {

		if (number < 2) {
			return false;
		} else if (number == 2 || number ==3) {
			return true;
		}
		
		for (int i = 2; i <= number/2 ; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

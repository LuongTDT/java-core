package Test;

public class TestString {
	static final int a;
	
	static {
		a =10;
	}
//	public TestString() {
//		a = 10;
//	}
//	public TestString(int x) {
//		this.a = x;
//	}
	
	
	public static void main(String[] args) {
		System.out.println(new TestString().a);
	}
}

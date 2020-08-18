package datatype;

public class Datatype {
	/*
	 * Ep data type (2 loai)
	 * +Ep kieu rong: tu kieu du lieu nho sang kieu du lieu lon. ex: int --> long. double x = (double) 1/2;
	 * +Ep kieu hep: kieu lon hon sang nho hon.  ex: int x = (int) 1.0/2; (voi nhung du an lien quan den tien bac thi khong nen su dung ep kieu hep)
	 */
	

	public static void main(String[] args) {
		System.out.println(1/2); //integer (integer/integer = integer)
		System.out.println(1.0/2); // double (double/integer = double)
		System.out.println((double)1/2); //integer --> double
	}

}

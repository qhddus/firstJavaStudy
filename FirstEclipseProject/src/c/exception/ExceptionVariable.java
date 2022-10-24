package c.exception;

public class ExceptionVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionVariable sample= new ExceptionVariable();
		sample.checkVariable();
		sample.checkVariable2();
		sample.checkVariable3();

	}
	public void checkVariable() {
		int [] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.println("This code must run.");
	}
	public void checkVariable2() {
		try {
		int [] intArray = new int[5];
		
			System.out.println(intArray[5]);
		} catch (Exception e) {
		//	System.out.println(intArray.length); intArray를 못찾음 트라이안의 지역변수로 해서
		}
		System.out.println("This code must run.");
	}
	public void checkVariable3() {
		int [] intArray = null;
		try {
			intArray=new int[6];
			System.out.println(intArray[6]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.println("This code must run.");
	}

}

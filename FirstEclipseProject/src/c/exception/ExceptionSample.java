package c.exception;

public class ExceptionSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample sample=new ExceptionSample();
		//sample.arrayOutOfBounds();
		sample.arrayOutOfBoundsTryCatch();
	}
	public void arrayOutOfBounds() {
		int [] intArray=new int[5];
		System.out.println(intArray[5]);
	}
	public void arrayOutOfBoundsTryCatch() {
		try {
		int [] intArray=new int[5];
		System.out.println(intArray[5]);
		System.out.println("This code should run.");
		} catch(Exception e) {
		System.err.println("Exception occured.");
		}
		System.err.println("This code must run.");
	}
}
package c.impl;

public class FinalVariable {
	public void method(final int parameter) {
		final int localVariable;
		localVariable=2;
		//localVariable=3; 	파이널함수라 변수값이 변하지 않음
		//parameter=4;		
	}

}

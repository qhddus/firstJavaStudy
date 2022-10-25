package c.string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompare sample= new StringCompare();
		sample.checkString();
		sample.checkCompare();
		sample.checkCompareTo();
	}
	public void checkString() {
		String text="You must know String class.";
		String text2="아몰ㄹ하어랮ㄷ러";
		System.out.println("text.length()="+text.length());
		System.out.println("text.length()="+text2.length());
		System.out.println("text.isEmpty()="+text.isEmpty());
	}
	public void checkCompare() {
		String text="Check value";
		//String text2="Check value";
		//String의 경우 동일한 값을 갖는 객체가 있으면 이미만든 객체를 사용 text==text2이다
		String text2=new String("Check value");
		if(text==text2) {
			System.out.println("text==text2 result is same");
		} else {
			System.out.println("text==text2 result is different");
		}
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
		String text3="check value";
		if(text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same");
		}
	}
	public void checkCompareTo() {
		String text="a";
		String text2="b";
		String text3="c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}

}

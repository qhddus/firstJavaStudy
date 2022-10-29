package c.inner.practice;

public class MyPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class InputBox{
		
	}
	public void setUI() {
		InputBox input = new InputBox();
		KeyEventListener listener = new KeyEventListener() {
		public void	onKeyDown() {
			System.out.println("Key down");
		}
		public void onKeyUp() {
			System.out.println("Key up");
		}
		};
		
	}
}

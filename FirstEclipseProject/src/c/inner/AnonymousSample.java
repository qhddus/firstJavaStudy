package c.inner;

public class AnonymousSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousSample sample = new AnonymousSample();
		sample.setButtonListener();
		sample.setButtonListenerAnonymous();
	}
	public void setButtonListener() {
		MagicButton button = new MagicButton();
		MagicButtonListener listener = new MagicButtonListener();
		button.setListener(listener);
		button.onClickProcess();
	}
	class MagicButtonListener implements EventListener{
		public void onClick() {
			System.out.println("Magic Button Clicked!!!");
		}
	}
	public void setButtonListenerAnonymous() {
		MagicButton button = new MagicButton();
		/*
		 * EventListener listener = new EventListener(){
		 * public void onClick(){
		 * System.out.println("MagicButton Clicked!!!")
		 * }
		 * }; 	를 밑에 익명클래스로 바꿔 쓸수 있음
		 */ 
		button.setListener(new EventListener(){
			public void onClick() {
				System.out.println("Magic Button Clicked!!");
			}
		});						//익명클래스
		button.onClickProcess();
	}

}

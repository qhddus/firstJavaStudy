package c.string;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCheck sample = new StringCheck();
		String addresses[] = new String[] {
				"서울시 구로구 신도림동",
				"경기도 성남시 분당구 정자동 개발 공장",
				"서울시 구로구 개봉동",
				"동 서울시 구로"
		};
		sample.checkAddress(addresses);
		sample.containsAddress(addresses);
		sample.checkMatch();

	}
	public void checkAddress(String[] addresses) {
		int startCount=0,endCount=0;
		String startText="서울시";
		String endText="동";
		for(String address:addresses) {
			if(address.startsWith(startText)) {
				startCount++;
			}
			if(address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with "+startText+" count is " +startCount);
		System.out.println("Ends with "+endText+" count is "+endCount);
	}
	public void containsAddress(String[] addresses) {
		int containCount=0;
		String containText="구로";
		for(String address:addresses) {
			if(address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Contains "+containText+" count is "+containCount);
	}
	public void checkMatch() {
		String text="This is a text";
		String compare1="is";
		String compare2="this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true,0,compare2,0,4));
		//1, ignoreCase true일 경우 대소문자 구분하지않고 값을 비교
		//2, toffset 	비교대상 문자열의 확인 시작위치 지정
		//3, other 		존재하는지를 확인할 문자열을 의미
		//4, ooffset	other객체의 확인 시작 위치를 지정
		//5, len		비교할 char의 개수를 지정
		//매개변수가 4개일경우 1번 생략
	}
}
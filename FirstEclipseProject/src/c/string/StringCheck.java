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
		//sample.checkAddress(addresses);
		//sample.containsAddress(addresses);
		//sample.checkMatch();
		//sample.checkIndexOf();
		//sample.checkLastIndexOf();
		//sample.checkSubstring();
		sample.checkSplit();
		//sample.checkTrim();
		//sample.checkReplace();
		//sample.checkFormat();

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
	public void checkIndexOf() {
		String text="Java technology is both a programming language and a platform.";
		System.out.println(text.indexOf('a'));		//a의 위치
		System.out.println(text.indexOf("a "));		//a(공백) 의 위치
		System.out.println(text.indexOf('a',20));	//a의 20번째이후의 위치
		System.out.println(text.indexOf("a ",20));	//a(공백) 의 20번째 이후의 위치
		System.out.println(text.indexOf('z'));		//z의 위치
	}
	public void checkLastIndexOf() {
		String text="Java technology is both a programming language and a platform.";
				System.out.println(text.lastIndexOf('a'));
				System.out.println(text.lastIndexOf("a "));
				System.out.println(text.lastIndexOf('a',20));
				System.out.println(text.lastIndexOf("a ",20));
				System.out.println(text.lastIndexOf('z'));
	}
	public void checkSubstring() {
		String text="Java technology";
		String technology=text.substring(5);
		System.out.println(technology);
		String tech=text.substring(5,9);
		System.out.println(tech);
	}
	public void checkSplit() {
		//공백을 빼고 단어를 세로로 나열하는 메소드
		String text="Java technology is both a programming language and a platform.";
		String[] splitArray=text.split(" ");
		for(String temp:splitArray) {
			System.out.println(temp);
		}
	}
	public void checkTrim() {
		String strings[] = new String[] {
				" a"," b ","    c","d    ","e    f","   "
		};
		for(String string:strings) {
			System.out.println("["+string+"]");
			System.out.println("["+string.trim()+"]");//글자앞,뒤 공백 뺌
		}
	}
	public void checkReplace() {
		String text="The String class represents character strings.";
		System.out.println(text.replace('s','z'));		//s를 z로 바꿈
		System.out.println(text);						//text가잘나오나 출력
		System.out.println(text.replace("tring", "trike"));	//tring를 trike로 바꿈
		System.out.println(text.replaceAll(" ","|"));		//공백을 |로 바꿈
		System.out.println(text.replaceFirst(" ", "|"));	//첫공백만 |로 바꿈
	}
	public void checkFormat() {
		String text="My name is %s, now %d book writed,"
				+"days %f %% hour book writing continuation.";
		String realText=String.format(text, "이상민",7,10.5);
		System.out.println(realText);
	}
}
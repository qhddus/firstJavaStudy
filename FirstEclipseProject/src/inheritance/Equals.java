package inheritance;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Equals thisObject= new Equals();
	thisObject.equalMethod();
	thisObject.equalMethod2();
	}
	public void equalMethod() {
	MemberDTO obj1=new MemberDTO("Sangmin");
	MemberDTO obj2=new MemberDTO("Sangmin");
	if(obj1==obj2) {
		System.out.println("obj1 and obj2 is same");
	} else {
		System.out.println("obj1 and obj2 is different");
		
	}
	}
	public void equalMethod2() {
		MemberDTO obj1= new MemberDTO("Sang");
		MemberDTO obj2=new MemberDTO("Sang");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		} else {
			System.out.println("obj1 and obj2 is different");
			
		}
	}

}

package c.annotation;

import c.inheritance.Parent;

public class AnnotationOverride extends Parent{
	@Override	//페어런트 메소드에 프린트네임을 오버라이드
	public void printName() {
		System.out.println("AnnotationOverride");
	}
}

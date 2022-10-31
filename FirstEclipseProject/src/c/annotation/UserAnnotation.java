package c.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Target(ElementType.METHOD)			//타겟은 해당 어노테이션 사용대상을 지정,이 어노테이션은 메소드에 사용
@Retention(RetentionPolicy.RUNTIME)	//리텐션은 어노테이션 유지정보를 지정하는데 사용,이 어노테이션은 실행시에 참조
public @interface UserAnnotation {		//@인터페이스로 선언하면 @UserAnnotation으로 어노테이션 사용 가능
	public int number();				//메소드처럼 어노테이션 안에 선언해 놓은면, 이 어노테이션ㄴ을 사용할때 해당 항목에 대한 타입으로 값을 지정 가능
	public String text() default "This is first annotation";
	//default뒤에 있는 값이 어노테이션을 사용할때 기본값이 된다.
}

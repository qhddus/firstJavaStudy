package c.util;
import c.model.MemberDTO;
public class FinalReferenceType {
	final MemberDTO dto = new MemberDTO();
	public static void main(String args[]) {
		FinalReferenceType referenceType=new FinalReferenceType();
		referenceType.checkDTO();
	}
	public void checkDTO() {
		System.out.println(dto);
		//dto=new MemberDTO();
		dto.name="Sangmin";
		System.out.println(dto);
		dto.phone="01043534343";
		System.out.println(dto);
		
	}
}
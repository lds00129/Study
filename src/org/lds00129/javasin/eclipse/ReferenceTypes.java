package org.lds00129.javasin.eclipse;
public class ReferenceTypes {
	public static void main(String[] args) {
		ReferenceTypes reference = new ReferenceTypes();
		reference.callPassByValue();
	}
	
	public void callPassByValue() {
		int a=10;
		String b="b";
		MemberDTO member=new MemberDTO("Sangmin");
		passByValue(a,b, member);
		System.out.println("callPassByValue method result !!!");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("member.name="+member.name);
	}

	public void passByValue(int a, String b,MemberDTO member){
		a=20;
		b="z";
		member = new MemberDTO("SungChoon");
		System.out.println("passByValue method result !!!");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("member.name="+member.name);
	}
	
	
	
}
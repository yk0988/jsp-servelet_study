package ch04;

public class Grammar {
	//테스트
	public String name = "JSPStdy";
	public void jspStudy(int year) {
	
	System.out.println("변수 name은" + name + "입니다");
	System.out.println("변수 year" + year + "입니다");
	System.out.println(name + year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2013;
		Grammar g = new Grammar();
		g.jspStudy(year);
		
	}

}

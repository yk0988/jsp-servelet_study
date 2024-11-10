package ch04.Class.Private;
//분석되지 않는 컴파일 문제점 
//변수 s는 OutSider1가 아닌 private를 참조하였기에 안됨.

//
//class OutSider1{
//	private String s="OutSider";
//}
//
//public class Private {
//	public static void main(String[] args) {
//		OutSider1 o = new OutSider1();
//		System.out.println(o.s);
//	}
//}
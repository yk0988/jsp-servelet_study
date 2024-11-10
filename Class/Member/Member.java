package ch04.Class.Member;

public class Member {

    String m;  // 인스턴스 변수 'm' (초기화되지 않음, 기본값은 null)
    String m1 = "멤버변수";  // 인스턴스 변수 'm1', 초기값은 "멤버변수"

    // 생성자
    public Member() {
        String m = "지역변수";  // 지역 변수 'm'이 인스턴스 변수 'm'을 가림 (shadowing)
        System.out.println(m);  // 지역 변수 'm' 출력 ("지역변수"가 출력됨)
    }

    // main 메소드
    public static void main(String[] args) {
        Member member = new Member();  // 'Member' 객체 생성, 생성자가 호출되어 "지역변수" 출력
        System.out.println("초기화 하지 않은 맴버 변수 : " + member.m);  // 인스턴스 변수 'm' 출력 (초기화되지 않아서 null 출력)
        System.out.println("초기화 된 맴버 변수 : " + member.m1);  // 인스턴스 변수 'm1' 출력 (초기값 "멤버변수" 출력)
    }
}

/*
 * 인스턴스 변수의 특징: 객체의 상태를 나타내고, 객체가 생성될 때 할당됩니다. 객체가 사라질 때까지 값이 유지됩니다. 생성자의 특징: 객체
 * 생성 시 한 번만 실행되어 객체를 초기화합니다. 생성자 내에서 변수 값을 초기화하거나, 특정 로직을 실행하는 등의 역할을 합니다. 둘은
 * 서로 보완적인 역할을 합니다.
 */
package chap07.sec02_inheritance;

public class A_DmbCellPhone extends A_CellPhone {
	
	/*
	 * =============================================================
	 * 상속, inheritance
	 * =============================================================
	 * 상속은 두 클래스 사이의 수직적인 관계를 나타낸다.
	 * 한 클래스는 '상위', '부모' 클래스라 하고, 다른 하나는 '하위', '자식', '파생' 클래스라고 한다.
	 * 상위(부모) 클래스는 하위(자식) 클래스에게 자신의 멤버(필드, 메서드)를 물려준다.
	 * 따라서 하위(자식) 클래스에서는 따로 선언하지 않아도 상위(부모) 클래스가 가진 멤버(필드, 메서드)를 갖는다.
	 * 
	 * 상속을 하기 위해서는 하위 클래스 선언부에 'extends'를 사용한다.
	 * => [하위 클래스 선언부] extends [상위 클래스 이름]
	 * */
	
	/*
	 * 클래스 CellPhone을 상속한 클래스 DmbCellPhone
	 * 따로 명시하지 않았지만, 상위 클래서 CellPhone에 필드와 메서드를 물려받는다.
	 * */
	int channel;
	
	/*
	 * DmbCellPhone에는 명시되어 있지 않지만 CellPhone에서 물려받은 필드 model과 color가 있으므로
	 * 초기화 명령문에서 컴파일 오류가 발생하지 않는다.
	 * */
	A_DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

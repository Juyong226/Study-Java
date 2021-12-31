package chap07.sec02_inheritance;

public class A_DmbCellPhoneExample {

	public static void main(String[] args) {

		A_DmbCellPhone dmbCellPhone = new A_DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		/*
		 * DmbCellPhone에 명시되지 않았지만, CellPhone에 명시된 메서드까지도 호출이 가능하다.
		 * */
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.receiveVoice("끊어");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(25);
		dmbCellPhone.turnOffDmb();
	}

}

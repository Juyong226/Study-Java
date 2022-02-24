package chap09.sec04.exma01_nestedinterface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
	}

}

package chap07.sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷에 접속합니다.");
	}
}

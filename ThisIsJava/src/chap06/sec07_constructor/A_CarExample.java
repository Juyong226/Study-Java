package chap06.sec07_constructor;

public class A_CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.toString());
		
		Car hisCar = new Car("노랑", "UIJEONGBU202108_11");
		System.out.println(hisCar.toString());
		
		Car myCar = new Car("검정", "SEOUL202112_039", 3500);
		System.out.println(myCar.toString());
		
		Car yourCar = new Car("레드", "BUSAN201806_015", 3000);
		System.out.println(yourCar.toString());
		
		Car herCar = new Car("블루", "INCHEON201107_55", 3000, 200);
		System.out.println(herCar.toString());
	}

}

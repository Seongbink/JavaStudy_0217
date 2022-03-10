package a15_lombok;

public class CatTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.setModel("테슬라모델3");
		car1.setModel("테슬라모델y");
		System.out.println(car1.equals(car2));

	}

}

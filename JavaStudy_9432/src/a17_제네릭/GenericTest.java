package a17_제네릭;

import a13_인터페이스2.model.User;

public class GenericTest {
	
	public GenericEx<String> getExData(String data) {
		GenericEx<String> ex = new GenericEx<String>(data);
		return ex;
	}
	
	public GenericEx<User> getExData(User data) {
		GenericEx ex = new GenericEx<User>(data);
		return ex;
	}

	public static void main(String[] args) {
		GenericTest genericTest = new GenericTest();
		GenericEx<String> ex = genericTest.getExData("100");
		GenericEx<User> ex2 = genericTest.getExData(new User("seongbin", "1234", "강성빈", "a@gmail.com"));
		System.out.println(ex);
		System.out.println(ex2);

	}

}

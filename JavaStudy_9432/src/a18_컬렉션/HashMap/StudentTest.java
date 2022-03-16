package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		service.addStudent("강성빈", "aaa@gmail.com", "부산 동래구");
		service.addStudent("강성빈1", "bbb@gmail.com", "부산 동래구");
		service.addStudent("강성빈2", "ccc@gmail.com", "부산 동래구");
		service.showStudentAll();
		
		service.updateStudentByname("강성빈", "a123@naver.com", "부산 북구");
		service.showStudentByName("강성빈");
		
		service.deleteStudentByname("강성빈");
		service.showStudentAll();

	}

}

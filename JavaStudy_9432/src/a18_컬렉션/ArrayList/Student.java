package a18_컬렉션.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
	/*
	 * studentName
	 * studentEmail
	 * studentAddress
	 */
	private String name;
	private String email;
	private String address;

}

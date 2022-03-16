package a17_제네릭.User;

import a13_인터페이스2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class PersonalUser extends User{
	private String membershipNumber;
	
	public PersonalUser(String username, String password, String name, String email, String membershipNumber) {
		super(username, password, name, email);
		this.membershipNumber = membershipNumber;
	}
}

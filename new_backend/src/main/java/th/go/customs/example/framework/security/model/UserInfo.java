package th.go.customs.example.framework.security.model;
import java.util.Date;
import lombok.Data;


@Data
public class UserInfo {
	
	private String username;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String mobile;
	private String email;
	

}

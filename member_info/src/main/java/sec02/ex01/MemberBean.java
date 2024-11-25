package sec02.ex01;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class MemberBean {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
}
	

	
	
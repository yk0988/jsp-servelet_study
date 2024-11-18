package com.company.ex;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
 
@Getter @Setter
public class MemberVo {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	

}
package com.fd.api.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmailPassword {
	@NotNull(message="{userProfileInfoVO.emailId.notNull}")
	@NotEmpty(message="{userProfileInfoVO.emailId.notEmpty}")	
	@Email
	private String email;
	
	@NotNull(message="{userProfileInfoVO.password.notNull}")
	@NotEmpty(message="{userProfileInfoVO.password.notEmpty}")
	private String password;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

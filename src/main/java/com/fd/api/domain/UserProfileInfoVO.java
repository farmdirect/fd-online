package com.fd.api.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserProfileInfoVO  extends Response {
	
	private Long profileId;
	
	@NotNull(message="{userProfileInfoVO.emailId.notNull}")
	@NotEmpty(message="{userProfileInfoVO.emailId.notEmpty}")	
	@Email
	private String emailId;
	
	@NotNull(message="{userProfileInfoVO.password.notNull}")
	@NotEmpty(message="{userProfileInfoVO.password.notEmpty}")
	@Size(min=8, max=12, message="{userProfileInfoVO.password.size}")
	private String password;
	
	@NotNull(message="{userProfileInfoVO.firstName.notNull}")
	@NotEmpty(message="{userProfileInfoVO.firstName.notEmpty}")
	@Size(min=2, max=25, message="{userProfileInfoVO.firstName.size}")
	private String firstName;
	
	@NotNull(message="{userProfileInfoVO.lastName.notNull}")
	@NotEmpty(message="{userProfileInfoVO.lastName.notEmpty}")
	@Size(min=2, max=25,message="{userProfileInfoVO.lastName.size}")
	private String lastName;
	
	@NotNull(message="{userProfileInfoVO.phone.notNull}")
	@NotEmpty(message="{userProfileInfoVO.phone.notEmpty}")
	private String phone;
	
	private String status;
	
	private Long addressId;
	
	@NotNull(message="{userProfileInfoVO.address1.notNull}")
	@NotEmpty(message="{userProfileInfoVO.address1.notEmpty}")
	private String address1;
	
	@NotNull(message="{userProfileInfoVO.street.notNull}")
	@NotEmpty(message="{userProfileInfoVO.street.notEmpty}")
	private String street;
	
	@NotNull(message="{userProfileInfoVO.ciy.notNull}")
	@NotEmpty(message="{userProfileInfoVO.ciy.notEmpty}")
	private String ciy;
	
	@NotNull(message="{userProfileInfoVO.pin.notNull}")
	@NotEmpty(message="{userProfileInfoVO.pin.notEmpty}")
	private String pin;
	
	@NotNull(message="{userProfileInfoVO.state.notNull}")
	@NotEmpty(message="{userProfileInfoVO.state.notEmpty}")
	private String state;
	
	@NotNull(message="{userProfileInfoVO.country.notNull}")
	@NotEmpty(message="{userProfileInfoVO.country.notEmpty}")
	private String country;
	
	@NotNull(message="{userProfileInfoVO.geoLocId.notNull}")
	@NotEmpty(message="{userProfileInfoVO.geoLocId.notEmpty}")
	private String geoLocId;

	
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCiy() {
		return ciy;
	}
	public void setCiy(String ciy) {
		this.ciy = ciy;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String getGeoLocId() {
		return geoLocId;
	}
	public void setGeoLocId(String geoLocId) {
		this.geoLocId = geoLocId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserProfileInfoVO [profileId=");
		builder.append(profileId);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", password=");
		builder.append(password);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", status=");
		builder.append(status);
		builder.append(", addressId=");
		builder.append(addressId);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", street=");
		builder.append(street);
		builder.append(", ciy=");
		builder.append(ciy);
		builder.append(", pin=");
		builder.append(pin);
		builder.append(", state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
    
}

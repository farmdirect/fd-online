package com.fd.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PROFILE_ID")
	private long profileId;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private int addressId;

	@Column(name="ADDRESS1")
	private String address1;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY")
	private String country;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TS")
	private Date createdTs;

	@Column(name="GEO_LOC_ID")
	private String geoLocId;

	@Column(name="PIN")
	private String pin;

	@Column(name="STATE")
	private String state;

	@Column(name="STREET")
	private String street;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TS")
	private Date updatedTs;
	
	@Column(name="ADDRESS_TYPE")
	private int addressType;

	public Address() {
	}

	public long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public String getGeoLocId() {
		return this.geoLocId;
	}

	public void setGeoLocId(String geoLocId) {
		this.geoLocId = geoLocId;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Date getUpdatedTs() {
		return this.updatedTs;
	}

	public void setUpdatedTs(Date updatedTs) {
		this.updatedTs = updatedTs;
	}

	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	

}

package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class PersonDetails {
	@Id
	private  String id;
	private String name;
	private  String addrs;
	//speciay  property
	private  DrivingLicense licenseDetails;
	
	//toString()
	@Override
	public String toString() {
		return "PersonDetails [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
	

}

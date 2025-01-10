package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class DrivingLicense {
	private  String id;
	private  String type;
	private  LocalDateTime validateFrom;
	private  LocalDateTime   validTo;
	//special property
	private PersonDetails details;

}

package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity	
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AirtelCallerTune {
	@Id
	@GeneratedValue
	private  Integer tuneId;
	@NonNull
	@Column(length = 20)
	private  String  tuneName;
	@NonNull
	private  Long mobileNo;
	@NonNull
	private  Boolean indian;
	@Column(length = 20)
	@NonNull
	private  String numberType;
	@Version
	private  Integer   updateCount;  //Versioning
	@CreationTimestamp
	private  LocalDateTime  optedOn;  //timestamping1
	@UpdateTimestamp
	private  LocalDateTime  updatedOn;  //timestamping2

}

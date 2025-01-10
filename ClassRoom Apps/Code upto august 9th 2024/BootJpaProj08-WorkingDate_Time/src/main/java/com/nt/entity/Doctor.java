package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
public class Doctor {
	@SequenceGenerator(name = "gen1",sequenceName = "did_seq" ,initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	@Id	
	private Integer did;
	@Column(length = 25)
	@NonNull
	private String  dname;
	@Column(length = 25)
	@NonNull
	private String specialization;
	@NonNull
	private  LocalDateTime dob;
	@NonNull
	private  LocalTime toj;
	@NonNull
	private LocalDate  doj;

}

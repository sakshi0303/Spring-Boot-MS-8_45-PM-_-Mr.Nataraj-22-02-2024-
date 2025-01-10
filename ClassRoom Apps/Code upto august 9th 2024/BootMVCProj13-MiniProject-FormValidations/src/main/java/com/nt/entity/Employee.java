package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "EMPNO_SEQ1",initialValue = 5000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer empno;
	@NonNull
	@Column(length = 20)
	private  String ename;
	@NonNull
	private  Double sal=1200.0;
	@NonNull
	private  Integer deptno=10;
	@NonNull
	@Column(length = 20)
	private  String  job="CLERK";
	@Transient
	private   String  vflag="disabled";

}

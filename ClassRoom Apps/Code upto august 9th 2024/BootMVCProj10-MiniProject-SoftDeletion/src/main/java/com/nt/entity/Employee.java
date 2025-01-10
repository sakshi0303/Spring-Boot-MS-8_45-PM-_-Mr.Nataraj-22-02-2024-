package com.nt.entity;



import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="soft_deletion_emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@SQLDelete(sql="UPDATE SOFT_DELETION_EMP SET STATUS='inactive'  WHERE  EMPNO=?")
//@Where(clause="status <> 'inactive' ")  //deprecated
@SQLRestriction("status <> 'inactive' ")
public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "EMPNO_SEQ1",initialValue = 5000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer empno;
	@NonNull
	@Column(length = 20)
	private  String ename;
	@NonNull
	private  Double sal;
	@NonNull
	private  Integer deptno;
	@NonNull
	@Column(length = 20)
	private  String  job="CLERK";
	@Column(length = 10)
	private   String  status="active";

}

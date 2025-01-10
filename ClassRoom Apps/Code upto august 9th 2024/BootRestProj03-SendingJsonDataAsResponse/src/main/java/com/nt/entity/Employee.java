//Employee.java
package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@NonNull
   private int eno;
	@NonNull
   private String ename;
@NonNull
   private  String eaddrs;
@NonNull
   private  Float salary;
   private String[] favColors;
   private  List<String> nickNames;
   private  Set<Long> phoneNumbers;
   private Map<String,Object> idDetails;
   private  JobDetails  jobInfo;
}

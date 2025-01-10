package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("company")
@ConfigurationProperties(prefix = "org.nt")

@Data
public class Company {
   private String name;
   private  String location;
   private  String email;
  // @Value("${org.nt.capacity}")
   private  Integer size;
   
     private  String[] branches;
     private  List<String> owners;
     private  Set<Long> phones;
     
     private  Map<String,Object> idDetails;
     private   License   licenseDetails;
  
  
      
   
}

package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "IPLTeam")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IPLTeam {
	@Id
  private  String id;
  private   String name;
	private   String  city;
	private   String owner;
  private   String captain;
  private  String coach;
}

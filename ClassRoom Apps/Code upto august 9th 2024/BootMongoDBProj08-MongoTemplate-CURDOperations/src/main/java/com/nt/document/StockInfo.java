package com.nt.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockInfo {
	@Id
	private Integer  stockId;
	private  String stockName;
	private Float  price;
	private LocalDate  doi;
	private  String  company;
	private String exchangeName;

}

package com.nt.runner;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockInfo;
import com.nt.service.IStockMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	@Autowired
	private  IStockMgmtService  stockService;

	@Override
	public void run(String... args) throws Exception {
		/*	//prepre object
			StockInfo  info=new StockInfo(new Random().nextInt(3000000), "SBI", 345.5f, LocalDate.now(),"SBI");
			String msg=stockService.registerStock(info);
			System.out.println(msg);*/
		
		/*	StockInfo  info1=new StockInfo(new Random().nextInt(3000000), "TCS", 45.5f, LocalDate.now(),"TATA");
			StockInfo  info2=new StockInfo(new Random().nextInt(3000000), "polaris", 4592.5f, LocalDate.now(),"Virtusa -Polaris");
			StockInfo  info3=new StockInfo(new Random().nextInt(3000000), "wipro", 451.5f, LocalDate.now(),"wipro");
			
			String msg=stockService.registerStocks(List.of(info1,info2,info3));
			System.out.println(msg);*/
		
		/*   stockService.seachStocksByCompany("Meta").forEach(System.out::println);
		   System.out.println("==========================");
		   stockService.seachStocksByPriceRange(100.0f, 5000.0f).forEach(System.out::println);*/
		
		
		/*String msg=stockService.seachAndModifyStock("SBI", 567.0f, "BSE");
			System.out.println(msg);*/
		
		String msg=stockService.searchAndModifyStocksInfo("ICICI", "FaceBook", "SBI", "NSE");
		System.out.println(msg);
		 
		
		

	}

}

package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.mongodb.internal.bulk.UpdateRequest;
import com.nt.document.StockInfo;

@Service("stockService")
public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
	private MongoTemplate  template;

	@Override
	public String registerStock(StockInfo info) {
	
		   //template.insert(info, "StockDetials"); //saves document in the collection name
		 int idVal=template.insert(info).getStockId();  //saves the document having  document class name as the collection  or with the name given in @Document
		return "Document is saved with  the id value :"+idVal;
	}
	
	@Override
	public String registerStocks(List<StockInfo> stocksInfo) {
		  template.insert(stocksInfo,StockInfo.class);
		return stocksInfo.size()+"  no.of docs are inserted";
	}
	
	@Override
	public List<StockInfo> seachStocksByCompany(String company) {
		  Query  query=new Query();
		  query.addCriteria(Criteria.where("company").is(company));
		  List<StockInfo> list=template.find(query, StockInfo.class);
		return list;
	}
	
	@Override
	public List<StockInfo> seachStocksByPriceRange(float startPrice, float endPrice) {
		  Query  query=new Query();
		  query.addCriteria(Criteria.where("price").gte(startPrice).lte(endPrice));
		  List<StockInfo> list=template.find(query, StockInfo.class);
			
		return list;
	}
	
	@Override
	public String seachAndModifyStock(String stockName, float newPrice, String exchangeName) {
		//prepare Query object
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").is(stockName));
		//prepare update object
		Update update=new Update();
		update.set("price", 600.0f);
		update.set("exchangeName", "BSE");
		StockInfo info=template.findAndModify(query, update, StockInfo.class);
		return  info==null?"Stock not found":"Stock found and updated";
	}
	
	@Override
	public String searchAndModifyStocksInfo(String stock1, String stock2, String stock3, String exchangeName) {
		//prepare Query object
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").in(stock1,stock2,stock3));
		//Update object
		Update update=new Update();
		update.set("exchangeName", exchangeName);
		UpdateResult  result=template.updateMulti(query, update, StockInfo.class);
		return  result.getModifiedCount()+" records are updated";
	}

	
}

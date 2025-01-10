//IStockMgmtService.java
package com.nt.service;

import java.util.List;

import com.nt.document.StockInfo;

public interface IStockMgmtService {
    public  String    registerStock(StockInfo info);
    public   String     registerStocks(List<StockInfo> stocksInfo);
    public   List<StockInfo>  seachStocksByCompany(String company);
    public   List<StockInfo>  seachStocksByPriceRange(float startPrice,float endPrice);
    public    String     seachAndModifyStock(String stockName,float newPrice, String exchangeName);
    
    public   String    searchAndModifyStocksInfo(String stock1,String stock2,String stok3, String exchangeName);
}

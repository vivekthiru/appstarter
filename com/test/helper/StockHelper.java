package com.test.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.test.model.Header;
import com.test.model.Stock;
import com.test.utils.Utilities;

public class StockHelper {
	
	public Map populateStock(){
		
		List stockList = new ArrayList();
		Stock st = new Stock();
	     st.setStockCode("ONGC");
	     st.setStockName("ONGC");
	     st.setQty(100);
	     st.setBuyPrice(12.20);
	     st.setCurrPrice(13.25);
	     st.setAssetValue(120);
	     st.setProfitLoss(+50);
	     
	     Stock st1 = new Stock();
	     st1.setStockCode("TCS");
	     st1.setStockName("TCS");
	     st1.setQty(100);
	     st1.setBuyPrice(12.20);
	     st1.setCurrPrice(13.25);
	     st1.setAssetValue(120);
	     st1.setProfitLoss(+50);
	      
	     stockList.add(st);
	     stockList.add(st1);
	     
	     
	     Map m = new HashMap();
	     m.put("content",stockList);
	     m.put("header",getTableHeaders());
	     
	     return m;
	}

	
	public List getTableHeaders(){
		
		String[] headerArray = {"Stock Code-stockCode","Stock Name-stockName",
				"Quantity-qty","Buy Price-buyPrice","Current Price-currPrice",
				"Asset Value-assetValue","Profit/Loss-profitLoss"};
		
		return Utilities.convertTableHeadertoList(headerArray);
	}
}

package com.test.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.test.model.Header;
import com.test.model.Stock;

public class Utilities {
	
	public static List convertTableHeadertoList(String[] headerArray){
		
		List headerList = new ArrayList();
		for (int i = 0; i < headerArray.length; i++) {
			Header header = new Header();
			header.setDisplayname(headerArray[i].split("-")[0]);
			header.setVariablename(headerArray[i].split("-")[1]);
			header.setModelname("var"+headerArray[i].split("-")[1]);
			headerList.add(header);
		}
		
		return headerList;
		
		
	}
	
}

package com.test.helper;

import java.util.ArrayList;
import java.util.List;

import com.test.model.Student;

public class EmployeeHelper {
	
	public List populateEmployees(){
		
		List entityList = new ArrayList();
		Student st = new Student();
	       st.setAge(12);
	       st.setId(1);
	       st.setName("Tamil");
	     entityList.add(st);  
	     Student st1 = new Student();
	       st1.setAge(12);
	       st1.setId(2);
	       st1.setName("Robert");
	       entityList.add(st1);
	       return entityList;
	}

}

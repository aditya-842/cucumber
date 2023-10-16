package com.sarvatra.test.ehub.Stepdefination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.beust.jcommander.internal.Maps;
import com.google.common.collect.MapDifference;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.TestPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class Teststep {
	TestPage tp = new TestPage(DriverFactory.driver);

	@Then("verify  PPI product issuing bank details")
	public void verify_field_names_and_field_values_in_ppi_product_issuing_bank_details(DataTable table) {

		// System.out.println(table.toString());
		List<Map<String, String>> tabledata = table.asMaps(String.class, String.class);
		System.out.println("Table data from cucumber:" + tabledata);
		List<String> fieldNames = new ArrayList<>();
		fieldNames.addAll(tp.getProducttablefiledNames());
		List<String> fieldValues = new ArrayList<>();
		fieldValues.addAll(tp.getProducttablefiledValues());

		Map<String, String> map = new LinkedHashMap<String, String>();

		for (int i = 0; i < fieldNames.size(); i++) {
			map.put(fieldNames.get(i), fieldValues.get(i));
		}
		System.out.println("**************************************************");
		
		List<Map<String, String>> sarvathradata = new ArrayList<>();
		sarvathradata.add(map);
		System.out.println("Data from Sarvathra:" +sarvathradata);
		
		
		
		  boolean f= sarvathradata.equals(tabledata);
		  System.out.println(f);
		  
		  
		 
		 

		/*
		 * List<List<String>> actuallist=new ArrayList<List<String>>();
		 * 
		 * actuallist.addAll(Arrays.asList(tp.getProducttablefiledNames(),tp.
		 * getProducttablefiledValues()));
		 * 
		 * DataTable actual= DataTable.create(actuallist);
		 * 
		 * System.out.println("Actual Data printing from fields and values:"+actual);
		 * table.diff(actual);
		 */

	}

	
}

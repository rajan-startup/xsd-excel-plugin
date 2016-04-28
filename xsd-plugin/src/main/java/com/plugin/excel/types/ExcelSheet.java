package com.plugin.excel.types;

import java.util.ArrayList;
import java.util.List;

/**
 * It stores all Excel cells in a given one ExcelSheet 
 * 
 * @author rdhabal
 *
 */
public class ExcelSheet {

	private String name;
	private List<List<ExcelCell>> rows;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<List<ExcelCell>> getRows() {
		if(rows==null){
			rows = new ArrayList<List<ExcelCell>>();
		}
		return rows;
	}
	
}

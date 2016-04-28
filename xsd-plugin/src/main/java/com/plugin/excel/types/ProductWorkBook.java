package com.plugin.excel.types;

import java.util.HashMap;
import java.util.Map;

/**
 * It represents One excel work book for Product categories
 * 
 * @author rdhabal
 *
 */
public class ProductWorkBook {
	
	private String categoryName;
	private Map<String,ExcelSheet> subCategorySheets = new HashMap<String,ExcelSheet>();
	private ExcelSheet caetgoryAttributes;
	private ExcelSheet productAttributes;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public ExcelSheet getCaetgoryAttributes() {
		return caetgoryAttributes;
	}
	public void setCaetgoryAttributes(ExcelSheet caetgoryAttributes) {
		this.caetgoryAttributes = caetgoryAttributes;
	}
	public ExcelSheet getProductAttributes() {
		return productAttributes;
	}
	public void setProductAttributes(ExcelSheet productAttributes) {
		this.productAttributes = productAttributes;
	}
	public Map<String, ExcelSheet> getSubCategorySheets() {
		return subCategorySheets;
	}
	public void setSubCategorySheets(Map<String, ExcelSheet> subCategorySheets) {
		this.subCategorySheets = subCategorySheets;
	}

}

package com.plugin.excel.types;



public class ExcelGenPluginConfig {

	private int headerRowHeight;
	private int documentRowHeight;
	private int documentFont;
	
	public int getDocumentFont() {
		return documentFont;
	}
	public void setDocumentFont(int documentFont) {
		this.documentFont = documentFont;
	}
	public int getHeaderRowHeight() {
		return headerRowHeight;
	}
	public void setHeaderRowHeight(int headerRowHeight) {
		this.headerRowHeight = headerRowHeight;
	}
	public int getDocumentRowHeight() {
		return documentRowHeight;
	}
	public void setDocumentRowHeight(int documentRowHeight) {
		this.documentRowHeight = documentRowHeight;
	}
	public static ExcelGenPluginConfig config(){
		ExcelGenPluginConfig config = new ExcelGenPluginConfig();
		config.setHeaderRowHeight(500);
		config.setDocumentRowHeight(500);
		config.setDocumentFont(16);
		return config;
	}
	
	
	
}

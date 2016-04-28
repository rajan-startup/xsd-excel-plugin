package com.plugin.excel.xsd.node.store.api;

import com.plugin.excel.types.ExcelCell;
import com.plugin.excel.types.ExcelSheet;

/**
 * 
 * 
 * @author rdhabal
 *
 */
public interface ExcelFormatterApi {

	/**
	 * It adds add cell into given ExcelSheet for given workBook file. 
	 * 
	 * @param workBookName
	 * @param excelSheet
	 */
	void buildIndex(String version,String workBookName, ExcelSheet excelSheet);

	/**
	 * It generates Excel sheet for all "Product" categories
	 * 
	 * @param version
	 * @param root
	 * @param directory
	 */
	void generateProductExcel(String version,String root,String directory);

	/**
	 * it takes cell-name defined into Excel sheet and returns its Node/Xpath which definied into XSD. 
	 * 
	 * @param version
	 * @param category
	 * @param subCategory
	 * @param cellName
	 * @return
	 */
	ExcelCell identifyCell(String version, String category,String subCategory, String cellName);

}

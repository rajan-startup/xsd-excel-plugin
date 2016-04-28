/**
 * 
 */
package com.plugin.excel.auto.test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.plugin.excel.util.ExcelFormatterApiImpl;
import com.plugin.excel.xsd.node.store.impl.ProductNodeManager;
import com.plugin.excel.xsd.node.store.impl.XsdNodeParserManagerImpl;

@ContextConfiguration(locations = {"/appContext.xml"})
public class ExcelGenerationManagerTest extends AbstractTestNGSpringContextTests {
	
	private static final String VERSION = "1.0";
	@Autowired
	private XsdNodeParserManagerImpl xsdParserMgr;
	@Autowired
	private ProductNodeManager productMgr;
	@Autowired
	private ExcelFormatterApiImpl excelFormatter;
	
	
	@Test(enabled=true)
	public void testExcelFileGeneration() throws IOException{
		String targetDirectory  = "src/main/resources/excel";
		excelFormatter.generateProductExcel(VERSION, "Root",targetDirectory);
		System.out.println("finish");
	}

	
	
}

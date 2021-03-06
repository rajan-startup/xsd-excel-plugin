package com.plugin.excel.type.node;


/**
 * It stores XSD token constant values 
 * 
 * @author rdhabal
 *
 */
public class XsdBaseType {

	
	public static final String BOOLEAN = "boolean";
	public static final String FLAG = "flag";
	public static final String STRING = "string";
	public static final String INTEGER = "integer";
	public static final String DECIMAL = "decimal";
	public static final String DATE = "date";
	public static final String DATE_TIME = "datetime";
	public static final String ANYURI = "anyURI";
	public static final String URL = "url";
	public static final String DOUBLE = "double";
	public static final String ANNOTATION = "annotation";
	public static final String DOCUMENTATION = "documentation";
	public static final String ADDITIONAL_ATTRIBUTE = "AdditionalAttributes";
	/*hack: we are adding it because Additional Attribute definition has not defined any where and metadata can't store complex-type without it's definition*/
	
	

}

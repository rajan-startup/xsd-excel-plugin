package com.plugin.excel.type.node;


/**
 * 
 * @author rdhabal
 *
 */
public enum XsdFormatType {

    HIERARCHICAL("HIERARCHICAL"),
    FLAT("FLAT");
 
    private final String value;
 
    XsdFormatType(String v) {
        value = v;
    }
 
    public String value() {
        return value;
    }
 
    public static XsdFormatType fromValue(String v) {
        for (XsdFormatType c: XsdFormatType.values()) {
            
        	if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
	
	
}

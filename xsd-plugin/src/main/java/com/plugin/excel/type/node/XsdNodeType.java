package com.plugin.excel.type.node;


/**
 * 
 * @author rdhabal
 *
 */
public enum XsdNodeType {

    COMPLEX("complex"),
    SIMPLE("simple"),
    ELEMENT("element");
 
    private final String value;
 
    XsdNodeType(String v) {
        value = v;
    }
 
    public String value() {
        return value;
    }
 
    public static XsdNodeType fromValue(String v) {
        for (XsdNodeType c: XsdNodeType.values()) {
            
        	if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
	
	
}

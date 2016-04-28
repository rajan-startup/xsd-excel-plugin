package com.plugin.excel.type.node;

/**
 * It stores tokens which will be used by NodeView to store customize information
 * such as: UsFoodCompliance : REQUIRED_COUNTRY
 * 
 * @author rdhabal
 *
 */
public enum ViewInfoToken {

    REQUIRED_COUNTRY("REQUIRED_COUNTRY");
 
    private final String value;
 
    ViewInfoToken(String v) {
        value = v;
    }
 
    public String value() {
        return value;
    }
 
    public static ViewInfoToken fromValue(String v) {
        for (ViewInfoToken c: ViewInfoToken.values()) {
            
        	if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
	
	
}

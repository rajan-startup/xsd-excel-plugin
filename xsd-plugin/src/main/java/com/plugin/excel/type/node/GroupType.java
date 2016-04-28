package com.plugin.excel.type.node;


/**
 * 
 * @author rdhabal
 *
 */
public enum GroupType {

    SEQUENCE("sequence"),
    CHOICE("choice"),
    ALL("all");
 
    private final String value;
 
    GroupType(String v) {
        value = v;
    }
 
    public String value() {
        return value;
    }
 
    public static GroupType fromValue(String v) {
        for (GroupType c: GroupType.values()) {
            
        	if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
	
	
}

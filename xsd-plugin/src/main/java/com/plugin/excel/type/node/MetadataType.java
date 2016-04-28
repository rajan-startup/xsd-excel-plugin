package com.plugin.excel.type.node;


/**
 * 
 * @author rdhabal
 *
 */
public enum MetadataType {

    BASE_ATTRIBUTE("BASE_ATTRIBUTE"),
    CATEGORY_1("CATEGORY_1"),
    CATEGORY_2("CATEGORY_2"),
    CATEGORY_3("CATEGORY_3"),
    COMPLIANCE("COMPLIANCE"),
    OTHER("OTHER");
 
    private final String value;
 
    MetadataType(String v) {
        value = v;
    }
 
    public String value() {
        return value;
    }
 
    public static MetadataType fromValue(String v) {
        for (MetadataType c: MetadataType.values()) {
            
        	if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
	
	
}

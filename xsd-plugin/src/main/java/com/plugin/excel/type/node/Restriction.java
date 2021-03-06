package com.plugin.excel.type.node;

import java.io.Serializable;
import java.util.List;

/**
 * It stores node restriction
 * 
 * @author rdhabal
 *
 */
public class Restriction implements Serializable{

	private String baseType;
	private int characterLength;
	private boolean isEnum;
	private List<String> enumValues;
	private double minInclusive;
	private double maxInclusive;
	
	public Restriction(){}
	
	public Restriction(String baseType, int characterLength, boolean isEnum,
			List<String> enumValues, double minInclusive, double maxInclusive) {
		super();
		this.baseType = baseType;
		this.characterLength = characterLength;
		this.isEnum = isEnum;
		this.enumValues = enumValues;
		this.minInclusive = minInclusive;
		this.maxInclusive = maxInclusive;
	}
	
	public String getBaseType() {
		return baseType;
	}
	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}
	public int getCharacterLength() {
		return characterLength;
	}
	public void setCharacterLength(int characterLength) {
		this.characterLength = characterLength;
	}
	public boolean isEnum() {
		return isEnum;
	}
	public void setEnum(boolean isEnum) {
		this.isEnum = isEnum;
	}
	public List<String> getEnumValues() {
		return enumValues;
	}
	public void setEnumValues(List<String> enumValues) {
		this.enumValues = enumValues;
	}
	public double getMinInclusive() {
		return minInclusive;
	}
	public void setMinInclusive(double minInclusive) {
		this.minInclusive = minInclusive;
	}

	public double getMaxInclusive() {
		return maxInclusive;
	}

	public void setMaxInclusive(double maxInclusive) {
		this.maxInclusive = maxInclusive;
	}
	
	
}

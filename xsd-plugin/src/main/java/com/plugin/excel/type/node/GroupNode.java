package com.plugin.excel.type.node;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * It combines NodeView for a given {@link Node}
 * 
 * @author rdhabal
 *
 */
public class GroupNode implements Serializable{

	private GroupType type;
	private List<NodeView> views = new ArrayList<NodeView>();
	private List<GroupNode> groups = new ArrayList<GroupNode>();
	private String minOccurs;
	private String maxOccurs;
	
	public GroupNode(GroupType type){
		this.type = type;
	}
	
	public GroupType getType() {
		return type;
	}
	public void setType(GroupType type) {
		this.type = type;
	}
	public List<NodeView> getViews() {
		return views;
	}
	public void setViews(List<NodeView> views) {
		this.views = views;
	}
	public List<GroupNode> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupNode> groups) {
		this.groups = groups;
	}

	public String getMaxOccurs() {
		return maxOccurs;
	}

	public void setMaxOccurs(String maxOccurs) {
		this.maxOccurs = maxOccurs;
	}

	public String getMinOccurs() {
		return minOccurs;
	}

	public void setMinOccurs(String minOccurs) {
		this.minOccurs = minOccurs;
	}
	
}

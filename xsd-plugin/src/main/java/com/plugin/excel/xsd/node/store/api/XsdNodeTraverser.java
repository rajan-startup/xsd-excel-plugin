package com.plugin.excel.xsd.node.store.api;

import com.plugin.excel.type.node.Node;

/**
 * It traverses XSD node tree and builds asked format  
 * 
 * @author rdhabal
 *
 */
public interface XsdNodeTraverser {
	
	/**
	 * It traverses XSD node tree 
	 * 
	 * @param node
	 */
	void traverse(Node node);

}

package com.plugin.excel.xsd.node.store.api;

import java.util.Map;
import java.util.Set;

import com.plugin.excel.type.node.Node;

/**
 * 
 * It manages XSD node creation and building the node tree.
 * 
 * @author rdhabal
 *
 */
public interface XsdNodeParserManager {

	
	/**
	 * Get all simple types parsed by the given XsdNodeParser 
	 * 
	 * @param xsdParser
	 * @return
	 */
	Map<String,Node> getSimpleNodes(String version);
	
	/**
	 * Get all Complex types parsed by the given XsdNodeParser
	 * 
	 * @param xsdParser
	 * @return
	 */
	Map<String,Node> getComplexNodes(String version);
	
	/**
	 * It builds Node-tree for a given Complex Node
	 * 
	 * @param complexNodeType
	 * @return
	 */
	Node buildComplexNode(String version,String complexNodeType);

	/**
	 * It returns all supported versions
	 * @return
	 */
	Set<String> getSupportedVersions();
	
}

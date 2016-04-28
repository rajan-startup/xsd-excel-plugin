package com.plugin.excel.xsd.parse;

import com.sun.xml.xsom.parser.AnnotationParser;
import com.sun.xml.xsom.parser.AnnotationParserFactory;

/**
 * 
 * @author rdhabal
 *
 */
public class AnnotationFactory implements AnnotationParserFactory {
	public AnnotationParser create() {
		return new XsdAnnotationParser();
	}
}

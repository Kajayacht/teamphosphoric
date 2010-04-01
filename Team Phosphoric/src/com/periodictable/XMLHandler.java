package com.periodictable;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler {

	// ===========================================================
	// Fields
	// ===========================================================

	private boolean in_outertag = false;
	public String el = null;

	private XMLDataSet myParsedExampleDataSet = new XMLDataSet();

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public XMLDataSet getParsedData() {
		return this.myParsedExampleDataSet;
	}

	// ===========================================================
	// Methods
	// ===========================================================
	@Override
	public void startDocument() throws SAXException {
		this.myParsedExampleDataSet = new XMLDataSet();
	}

	@Override
	public void endDocument() throws SAXException {
		// Nothing to do
	}

	public void setel(String a) {
		el = a;
	}

	@Override
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes atts) throws SAXException {

		if (localName.equals(el)) {

			String attrValue = atts.getValue("name");
			myParsedExampleDataSet.setname(attrValue);

			attrValue = atts.getValue("sym");
			myParsedExampleDataSet.setsym(attrValue);

			attrValue = atts.getValue("atomicnumber");
			int i = Integer.parseInt(attrValue);
			myParsedExampleDataSet.setatomicnumber(i);

			attrValue = atts.getValue("aw");
			double d = Double.parseDouble(attrValue);
			myParsedExampleDataSet.setaw(d);

			attrValue = atts.getValue("rmst");
			myParsedExampleDataSet.setrmst(attrValue);

			attrValue = atts.getValue("cat");
			myParsedExampleDataSet.setcat(attrValue);

			attrValue = atts.getValue("den");
			d = Double.parseDouble(attrValue);
			myParsedExampleDataSet.setden(d);

			attrValue = atts.getValue("meltpt");
			d = Double.parseDouble(attrValue);
			myParsedExampleDataSet.setmeltpt(d);

			attrValue = atts.getValue("boilpt");
			d = Double.parseDouble(attrValue);
			myParsedExampleDataSet.setboilpt(d);

			attrValue = atts.getValue("critpt");
			myParsedExampleDataSet.setcritpt(attrValue);

			attrValue = atts.getValue("crabun");
			myParsedExampleDataSet.setcrabun(attrValue);

			attrValue = atts.getValue("ocabun");
			myParsedExampleDataSet.setocabun(attrValue);

			attrValue = atts.getValue("ionen");
			d = Double.parseDouble(attrValue);
			myParsedExampleDataSet.setionen(d);

			attrValue = atts.getValue("elpshell");
			myParsedExampleDataSet.setelpshell(attrValue);

			attrValue = atts.getValue("vid");
			myParsedExampleDataSet.setvid(attrValue);

		}
	}

	/**
	 * Gets be called on closing tags like: </tag>
	 */
	@Override
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException {
		if (localName.equals("outertag")) {
			this.in_outertag = false;
		}
	}

}
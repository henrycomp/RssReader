package com.android.firstrssreader.util;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.android.firstrssreader.data.RssItem;

public class RssParseHandler extends DefaultHandler {

private List<RssItem> rssItems;

	private RssItem currentItem;
	
	private boolean parsingTitle;
	private boolean parsingLink;
	
	public RssParseHandler() {
		rssItems = new ArrayList<RssItem> ();
	}
	
	public List<RssItem> getItems() {
		return rssItems;
	}
	
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO auto-generated method stub
		super.endElement(uri, localName, qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO auto-generated method stub
		super.characters(ch, start, length);
	}
}

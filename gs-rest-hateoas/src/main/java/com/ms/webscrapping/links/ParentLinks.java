package com.ms.webscrapping.links;

import java.util.List;

import com.ms.webscrapping.util.LinkExtractor;

public class ParentLinks implements Links {

	private String url;
	private List<String> links;

	public ParentLinks(String url) {
		super();
		this.url = url;
		links = LinkExtractor.extractLinks(url);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setLinks(List<String> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "ParentLinks [url=" + url + ", links=" + links + "]";
	}
	
	

}

package com.ms.webscrapping.links;

import java.util.ArrayList;
import java.util.List;

import com.ms.webscrapping.util.LinkExtractor;

public class ChildLinks implements Links {

	private String url;
	private List<ParentLinks> childLinks;

	public ChildLinks(String url) {
		super();
		this.url = url;
		childLinks = getChildLinks(url);
	}

	public String getUrl() {
		return url;
	}

	public List<ParentLinks> getChildLinks() {
		return childLinks;
	}

	private List<ParentLinks> getChildLinks(String url) {
		List<ParentLinks> pLinks = new ArrayList<>();
		List<String> links = LinkExtractor.extractLinks(url);
		for(String link : links)
			pLinks.add(new ParentLinks(link));
		return pLinks;
	}
}

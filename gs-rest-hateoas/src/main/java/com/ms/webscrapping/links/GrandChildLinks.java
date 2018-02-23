package com.ms.webscrapping.links;

import java.util.ArrayList;
import java.util.List;

import com.ms.webscrapping.util.LinkExtractor;

public class GrandChildLinks implements Links{
	
	private String url;
	private List<ChildLinks> childLinks;

	public GrandChildLinks(String url) {
		super();
		this.url = url;
		childLinks = getChildLinks(url);
	}

	public String getUrl() {
		return url;
	}

	public List<ChildLinks> getChildLinks() {
		return childLinks;
	}

	private List<ChildLinks> getChildLinks(String url) {
		List<ChildLinks> pLinks = new ArrayList<>();
		List<String> links = LinkExtractor.extractLinks(url);
		for(String link : links)
			pLinks.add(new ChildLinks(link));
		return pLinks;
	}
}

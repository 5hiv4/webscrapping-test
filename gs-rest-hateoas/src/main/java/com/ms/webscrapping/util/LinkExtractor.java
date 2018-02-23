package com.ms.webscrapping.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkExtractor {
	
	public static List<String> extractLinks(String url){
		List<String> list = new ArrayList<>();
		
		if(url.equals("/") || url.contains("#") || url.contains("tel") || url.contains("@"))
			return null;
		
		Document doc;
        try {

            // need http protocol
            doc = Jsoup.connect(url).get();

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("link : " + link.attr("href"));
                list.add(link.attr("href"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return list;
	}

}

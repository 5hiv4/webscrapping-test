package com.ms.webscrapping;

import org.springframework.web.bind.annotation.RestController;

import com.ms.webscrapping.links.ChildLinks;
import com.ms.webscrapping.links.GrandChildLinks;
import com.ms.webscrapping.links.Links;
import com.ms.webscrapping.links.ParentLinks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WebScrappingController {


    @RequestMapping("/crawl")
    public Links greeting(
            @RequestParam(value = "url", required = false, defaultValue = "http://mysmallwebpage.com") String url,
            @RequestParam(value = "depth", required = false, defaultValue = "1") int depth) {

    	if(depth == 1){
    		return new ParentLinks(url);
    	} else if(depth == 2){
    		return new ChildLinks(url);
    	} else if(depth == 3){
    		return new GrandChildLinks(url);
    	} else{
    		return null;
    	}
        
    }
}

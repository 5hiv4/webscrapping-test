package com.ms.webscrapping;

import org.springframework.web.bind.annotation.RestController;

import com.ms.webscrapping.links.Links;
import com.ms.webscrapping.links.ParentLinks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WebScrappingController {


    @RequestMapping("/crawl")
    public Links greeting(
            @RequestParam(value = "url", required = false, defaultValue = "https://google.com") String url) {

    	
    	ParentLinks pLinks = new ParentLinks(url);
    	return pLinks;
        
    }
}

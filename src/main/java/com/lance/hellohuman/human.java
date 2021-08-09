package com.lance.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class human {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "<h1>Hello Human!<h1>"
					+ "<p>Welcome to SpringBoot<p>";
		}else {
				return "<h1> Hello" + searchQuery + "<h1>"
						+ "<p>Welcome to SpringBoot<p>";
		}
		
	}
}

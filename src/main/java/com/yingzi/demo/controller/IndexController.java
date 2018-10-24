package com.yingzi.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index 1.0.1";
	}
}

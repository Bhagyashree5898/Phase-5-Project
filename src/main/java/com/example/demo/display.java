package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class display {
	@ResponseBody
	@RequestMapping("Display")
	public String Display() {
		return "index.html";
	}
}

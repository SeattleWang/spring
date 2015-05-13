package com.shininghub.seattle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shininghub.seattle.mapper.PictureLibMapper;

@Controller
public class PictureLibController {
	@Autowired
	private PictureLibMapper pictureLibMapper;
	
	@RequestMapping("show")
	public ModelAndView show() {
		System.out.println("----------123-----------");
		ModelAndView modelAndView = new ModelAndView(
				"/qiniu/show");
		
		return modelAndView;
		
	}
	
}

package com.shininghub.seattle.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shininghub.seattle.service.PictureLibService;

@Controller("pictureLibController")
public class PictureLibController {
	@Autowired
	private PictureLibService pictureLibService;
	
	
	@RequestMapping("show")
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("----------123-----------");
		ModelAndView modelAndView = new ModelAndView(
				"/qiniu/show");
		modelAndView.addObject("seattle", pictureLibService.load(1));
		//modelAndView.addObject("seattle","wangsong");
		
		return modelAndView;
		
	}
	
}

package com.java.web.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationBasedAddController {

	@RequestMapping("/addNum")
	public ModelAndView add(@RequestParam("a") int i, @RequestParam("b") int k) {
		System.out.println("Annonation based Controller");
		AddService add = new AddService();
		int result = add.add(i, k);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
	}
}

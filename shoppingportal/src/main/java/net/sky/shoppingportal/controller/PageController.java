package net.sky.shoppingportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"}) //Mapping page.jsp with /,home and index
	
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page"); //page would be the master page
//		mv.addObject("greeting","Welcome to Spring MVC");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
@RequestMapping(value = "/about") //Mapping page.jsp with /,home and index
	
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page"); //page would be the master page
//		mv.addObject("greeting","Welcome to Spring MVC");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
@RequestMapping(value = "/contact") //Mapping page.jsp with /,home and index

public ModelAndView contact() {
	
	ModelAndView mv = new ModelAndView("page"); //page would be the master page
//	mv.addObject("greeting","Welcome to Spring MVC");
	mv.addObject("title","Contact Us");
	mv.addObject("userClickContact",true);
	return mv;
}
	
	
/*@RequestMapping(value="/test") //Mapping page.jsp with test using ANNOTATIONS
	
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		if(greeting == null) {
			greeting="Hello there";  //assigning the default value to agreeting
		}
		ModelAndView mv = new ModelAndView("page"); //page would be the master page
		mv.addObject("greeting",greeting);
		return mv;
	}*/

/*@RequestMapping(value="/test/{greeting}") //Mapping page.jsp with test using ANNOTATIONS
                                          //this greeting would be DYNAMIC and would be 
										  //stored in string variable(greeting) 

public ModelAndView test(@PathVariable("greeting")String greeting) { //here it is stored 
	if(greeting == null) {
		greeting="Hello there";  //assigning the default value to a greeting
	}
	ModelAndView mv = new ModelAndView("page"); //page would be the master page
	mv.addObject("greeting",greeting);
	return mv;
}
	*/
}

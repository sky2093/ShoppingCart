package net.sky.shoppingportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sky.shoppingbackend.dao.CategoryDAO;
import net.sky.shoppingbackend.dto.Category;

@Controller
public class PageController {

	
	@Autowired  //Using Autowiring feature of spring framework via Annotations
	private CategoryDAO categoryDAO;
	
	
	
	
	@RequestMapping(value = {"/", "/home", "/index"}) //Mapping page.jsp with /,home and index
	
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page"); //page would be the master page
//		mv.addObject("greeting","Welcome to Spring MVC");
		mv.addObject("title","Home");
		
   //Passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
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



/*
 * Method to load all the products and based on category
 * */
 
@RequestMapping(value = "/show/all/products") //Mapping page.jsp with products

public ModelAndView showAllProducts() {
	
	ModelAndView mv = new ModelAndView("page"); //page would be the master page
//	mv.addObject("greeting","Welcome to Spring MVC");
	mv.addObject("title","All Products");
	
	//Passing the list of categories
			mv.addObject("categories",categoryDAO.list());
	
	mv.addObject("userClickAllProducts",true);
	return mv;
}

@RequestMapping(value = "/show/category/{id}/products") //Mapping page.jsp with Category using path variable since it will change on da basis of id 

public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
	
	ModelAndView mv = new ModelAndView("page"); //page would be the master page
//	mv.addObject("greeting","Welcome to Spring MVC");
	
	//Category DAO to fetch single category since title would be the name of that single particular category
	
	Category category = null;
	
	category  = categoryDAO.get(id);
	
	//Passing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
	//passing the single category object
			mv.addObject("category",category);
	
	mv.addObject("title",category.getName());
	mv.addObject("userClickCategoryProducts",true);
	return mv;
}

}

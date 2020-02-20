package controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.Customer;

@Controller
public class HelloController {
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView showHelloPage() {
		System.out.println("Iam coming from Hello");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("hello-page");
		mv.addObject("location", "Fairfax, Virginia");
		
		Customer c= new Customer();
		c.setName("ipanga");
		c.setEmail("ipangaloic@gmail.com");
		
		mv.addObject("loggedInCustomer", c);
		
		return mv;
	}

}

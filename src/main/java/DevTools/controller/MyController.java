package DevTools.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

     @RequestMapping(value = "/about",method = RequestMethod.GET )
	public String about(Model model) {
		System.out.println("this is about pages");
		model.addAttribute("name","arifur rahman");
		model.addAttribute("CurrentDate",new Date().toLocaleString());
		return "about";
	}

}

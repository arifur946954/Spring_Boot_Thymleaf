package DevTools.controller;

import java.util.Date;
import java.util.List;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

     @RequestMapping(value = "/abouts",method = RequestMethod.GET )
	public String about(Model model) {
		System.out.println("this is about pages");
		model.addAttribute("name","arifur rahman");
		model.addAttribute("CurrentDate",new Date().toLocaleString());
		return "about";
	}
     
     //iteration 
     @GetMapping("/iterate-example")
          public String iterationHandle(Model mdl) {
    	  List<String> name=List.of("Arif","Zarif","sharif","sakib");
    	  mdl.addAttribute("names",name);//names=name
    		mdl.addAttribute("name","arifur rahman sfkjhs");//name=arifur rahman
    	 return "iteration";
		
	}
     @GetMapping("/condition")
     public String condition(Model m) {
    
    	 m.addAttribute("isActive",true);//isActive=true
    	 m.addAttribute("Gender",'F');
    	 return "condition";
		
	}
     @GetMapping("/service")
     public String serviceHandle(Model m) {
    	 m.addAttribute("title","this is title for thymlef");
    	 m.addAttribute("subtitle", new Date().toLocaleString());
    	 return "service";
    	 
    	 
     }
     @GetMapping("/aboutNew")
     public String newAbout(Model m) {
    	 return "aboutNew";
     }

}

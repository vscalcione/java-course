package it.intersistemi.corsojava.springframework.pathvariable;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcPathVariableMain {

	@RequestMapping(value="/str/{countryName}/{userName}", method=RequestMethod.GET) 
	public ModelAndView getStringData(@PathVariable("countryName") String countryName, @PathVariable("userName") String userName) {
		ModelAndView model = new ModelAndView();
		model.addObject("Messaggio", "Paese di provenienza: " + countryName + " =======  Nome:  " + userName);
		model.setViewName("success");
		return model;
	}

	@RequestMapping(value="/map/{countryName}/{userName}", method=RequestMethod.GET)
	public ModelAndView getMapData(@PathVariable Map<String, String> path) {
		String countryName = path.get("countryName"), userName = path.get("userName");
		ModelAndView model = new ModelAndView();
		model.addObject("Messaggio", "Paese di provenienza: " + countryName + " =======  Nome:  " + userName);
		model.setViewName("success");
		return model;
	}
}

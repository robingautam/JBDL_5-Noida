package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home wala method called");
		model.addAttribute("name","Robin");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("suggestion","help page");
		mv.setViewName("help");
		return mv;
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@RequestParam("username") String name, @RequestParam("password") String password, Model model) {
		model.addAttribute("name",name);
		if ("admin123".equals(password)) {
			return "home";
		}else {
		return "redirect:/error";
		}
	}
	
	@RequestMapping(path="/loginRequest", method=RequestMethod.POST)
	public String login(HttpServletRequest request,Model model) {
		String name=request.getParameter("username");
		model.addAttribute("name",name);
		String password = request.getParameter("password");
		if ("admin123".equals(password)) {
			return "home";
		}else {
			return "redirect:/error";
		}
	}
	
	
	@RequestMapping(path="/loginModel", method=RequestMethod.POST)
	public String login(@ModelAttribute User user,Model model) {
	
		model.addAttribute("name",user.getUsername());
		String password = user.getPassword();
		if ("admin123".equals(password)) {
			return "home";
		}else {
			return "redirect:/error";
		}
	}
	
	@RequestMapping("/error")
	public String error() {
		return "error";
	}

}

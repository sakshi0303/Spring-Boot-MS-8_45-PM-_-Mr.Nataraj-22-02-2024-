package com.nt.controller;



import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShowHomeController {
	
	/*	//@RequestMapping("/home")
		@RequestMapping("/")
		public  String showHomePage() {//handler method
			// No business logic 
			// No Delegation logic
			return  "welcome";
		}
	*/
	
	/*//@RequestMapping("/home")
	@RequestMapping("/")
	public  String showHomePage(Map<String,Object> map) {//handler method
		System.out.println("ShowHomeController.showHomePage() map  refering to :"+map.getClass());
		
		// No business logic 
		//add model attributes in the shared memory
		 map.put("attr1", "val1");
		 map.put("attr2", "val2");
		 map.put("sysDate",new Date());
		 
		// No Delegation logic
		return  "welcome";
	}*/
	
	/*@RequestMapping("/")
	public  String showHomePage(Model model) {//handler method
		System.out.println("ShowHomeController.showHomePage() map  refering to :"+model.getClass());
		//add model attributes in the shared memory
		 model.addAttribute("attr1", "val1");
		model.addAttribute("attr2", "val2");
		model.addAttribute("sysDate",new Date());
		 
		// No Delegation logic
		 //return LVN
			return  "welcome";
	}*/
	
	/*@RequestMapping("/")
	public  String showHomePage(ModelMap model) {//handler method
		System.out.println("ShowHomeController.showHomePage() map  refering to :"+model.getClass());
		//add model attributes in the shared memory
		 model.addAttribute("attr1", "val1");
		model.addAttribute("attr2", "val2");
		model.addAttribute("sysDate",new Date());
		 
		// No Delegation logic
		 //return LVN
			return  "welcome";
	}
	*/
	
	/*	@RequestMapping("/home")
		public  Model showHomePage() {//handler method
			// create Shared Memory
			Model model=new BindingAwareModelMap();
			//add model attributes in the shared memory
			 model.addAttribute("attr1", "val1");
			model.addAttribute("attr2", "val2");
			model.addAttribute("sysDate",new Date());
			 
		   return model;
		}*/
	
	/*@RequestMapping("/home")
	public Map<String,Object> showHomePage() {//handler method
		// create Shared Memory
		Map<String,Object>  map=new HashMap<String, Object>();
		//add model attributes in the shared memory
		 map.put("attr1", "val1");
		map.put("attr2", "val2");
		map.put("sysDate",new Date());
		 
	   return map;
	}
	*/
	/*@RequestMapping("/home")
	public  void  showHomePage(Map<String,Object> map) {//handler method
		//add model attributes in the shared memory
		 map.put("attr1", "val1");
		map.put("attr2", "val2");
		map.put("sysDate",new Date());
	}
	*/
	/*@RequestMapping("/home")
	public  String showHomePage() {//handler method
		System.out.println("ShowHomeController.showHomePage()");
					return "forward:report";
	}
	
	@RequestMapping("/report")
	public   String    showReport() {
		System.out.println("ShowHomeController.showReport()");
		return  "show_report";
	}*/
	
	/*@RequestMapping("/home")
	public  String showHomePage() {//handler method
		System.out.println("ShowHomeController.showHomePage()");
					return "redirect:report";
	}
	
	@RequestMapping("/report")
	public   String    showReport() {
		System.out.println("ShowHomeController.showReport()");
		return  "show_report";
	}*/
	
	/*	  @RequestMapping("/process")
		  public  String   showData (HttpServletRequest  req, HttpSession ses) {
			  //add attributes
			    req.setAttribute("attr1", "val1");
			    ses.setAttribute("attr2", "val2");
			    return "show_data";
			  
		  }*/
	
	/*  @Autowired	
	  private  ServletConfig cg;
	  @Autowired
	  private   ServletContext sc;
	
	  @RequestMapping("/process")
	  public  String   showData (HttpServletRequest  req, HttpSession ses) {
		  System.out.println("DS logical name ::"+cg.getServletName());
		  System.out.println("web app name ::"+sc.getContextPath());
		  //add attributes
		    req.setAttribute("attr1", "val1");
		    ses.setAttribute("attr2", "val2");
		    return "show_data";
		  
	  }*/
	
	@RequestMapping("/direct")
	public   void    showData(HttpServletResponse  res) throws Exception{
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		res.setHeader("Content-Disposition","attachment;fileName=abc.html");
		
		pw.println("<b> hello how are  u?</b>");
	
		pw.close();
	}
	
}

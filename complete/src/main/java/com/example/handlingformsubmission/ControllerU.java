package com.example.handlingformsubmission;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller	
public class ControllerU{
	
		@Autowired
		VerificacionUsers Service;
		

		@GetMapping("/Login")
		public String greetingForm(Model model) {
			model.addAttribute("Login", new UsersService());
			return "Login";
		}

		@PostMapping("/Login")
		public String greetingSubmit(@ModelAttribute UsersService UsersService) {
			if(Service.verificar(UsersService.getPassword(),UsersService.getPassword())) {
		    	  return "okLogin";
		      }
			return"noLogin";
		}
		
      
	}



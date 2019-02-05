package bookcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {
//input: http://localhost:8080/index
	
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getbook(model model){
		model.addAttribute("book", new Book()); 
		
		
		
		
	};
	
	
	
	
}


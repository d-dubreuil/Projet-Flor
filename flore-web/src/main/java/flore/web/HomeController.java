package flore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "", "/","/home2" })
	public String home(Model model) {
		model.addAttribute("page", "home");

		return "/home";
	}
}


package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
	public String helloworld(
		@RequestParam(name="name", required=false, defaultValue="Kim") String name, Model model) {
		model.addAttribute("name", name);
        return "helloworld";
    }

}

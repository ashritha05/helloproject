package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ThisWillController {

	@RequestMapping("/")
	String home() {
		return "Hello World Aditya!";
	}

}

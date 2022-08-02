package lat.lugaresseguros.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@GetMapping("/")
	public String index() {
		System.out.println("Hola otra vez");
		return "Hello world";
	}
}

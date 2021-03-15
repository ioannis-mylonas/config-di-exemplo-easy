package teste.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteController {
	
	private final String testeString;
	
	public TesteController(String testeString) {
		this.testeString = testeString;
	}

	@GetMapping
	public String executa() {
		return testeString;
	}
	
}

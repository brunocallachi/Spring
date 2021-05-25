package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMappaing



public class HalloController {
	
	
	@GetMapping ("/hallo")
	public String Hallo(){
		return "MENTALIDADE DE PERSISTENCIA !!!";
	}

	
	@GetMapping ("/aprendizagem")
	public String aprendizagem(){
		return "Quero aprender mais sobre o Spring ";
	
}
}

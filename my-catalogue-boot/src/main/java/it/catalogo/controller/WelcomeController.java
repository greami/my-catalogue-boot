package it.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.catalogo.repository.ProdottoRepository;

@Controller
@RequestMapping("/")
public class WelcomeController
{
	
	@GetMapping("/test")
	@ResponseBody
	public String test()
	{
		return "Test sul controller";
	}
	

	
}

package it.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.catalogo.repository.ProdottoRepository;

@Controller
@RequestMapping("/prodotto")
public class ProdottoController
{

	@Autowired
	private ProdottoRepository repository;

	 @GetMapping("/lista")
	 @ResponseBody
	public String list()
	{
		  repository.findAll().forEach(p -> {
			  System.out.println(p.getId() + "-" + p.getNome() + "-" + p.getDescrizione() );});
		
		return "prodotti";
	}
}

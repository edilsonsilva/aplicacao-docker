package br.com.aplicacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@GetMapping("/home")
	public String home() {
		return "Olá! Seja bem vindo ao meu espaço";
	}
	@GetMapping("/clientes")
	public List<String> clientes(){
		List<String> cli = new ArrayList<String>();
		cli.add("Pedro Dias");
		cli.add("Roberto Noronha");
		cli.add("Vanessa Aparecida");
		cli.add("Roberta Monta");
		
		return cli;
	}
}

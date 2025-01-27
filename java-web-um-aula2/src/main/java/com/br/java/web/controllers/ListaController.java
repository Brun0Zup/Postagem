package com.br.java.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.java.web.services.ListaService;

@Controller
public class ListaController {

	@Autowired
	ListaService listaService;

	@RequestMapping
	@ResponseBody
	public List<String> showLista() {
		return listaService.mostrarLista();
	}

	@RequestMapping("/{nome}")
	@ResponseBody
	public String buscarNome(@PathVariable String nome) {
		return listaService.buscarNome(nome);

	}
	@RequestMapping("/delete/{nome}")
	@ResponseBody
	public String deletarNome(@PathVariable String nome) {
		return listaService.removerNome(nome);
	}
	
	@RequestMapping("/inserir/{nome}")
	@ResponseBody 
	public String addNome(@PathVariable String nome) {
		return listaService.adicionarNome(nome);
	}
}

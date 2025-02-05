package com.br.java.web.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListaService {

	private List<String> nomes = new ArrayList<String>(Arrays.asList("Vincius", "Bruno"));

	public List<String> mostrarLista() {
		return this.nomes;
	}

	public String buscarNome(String nomeUsuario) {
		String retorno = "";

		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeUsuario)) {
				retorno = nome;
			}
		}
		return retorno;
	}

	public String removerNome(String nomeDeletado) {
		String nomeDelete = "";
		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeDeletado)) {
				nomeDelete = nome;
			}
		}
		if (nomes.remove(nomeDelete)) {
			return "Nome apagado com sucesso";
		} else {
			return "Nome não encontrado";
		}
	}

	public String adicionarNome(String nomeUsuario) {
		boolean podeAdicionar = true;
		String resposta = "Nome adcionado";

		for (String nome : nomes) {	
			if (nomeUsuario.equalsIgnoreCase(nome)) {
				podeAdicionar = false;
				resposta = "Nome existe";
			}
		}

		if (podeAdicionar == true) {
			nomes.add(nomeUsuario);
		}
		return resposta;
	}

}

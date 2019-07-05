package com.br.java.web.models;

public class PostagemModel {

	
	private String usuario;
	private String postagem;
	
	public PostagemModel () {
		
	}
	
	
	public String PostagemModel(String usuario, String postagem) {
		this.usuario = usuario;
		return this.postagem = postagem;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}
	
	public String getPostagem() {
		return postagem;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Usuário: " + this.usuario);
		modelo.append("\nPostou: " + this.postagem);
		modelo.append("\n");
		
		return modelo.toString();
	}
}


package br.com.isiflix.auth.model;

public class Usuario {

	private String login;
	private String senha;
	private String nome;
	
	
	
	
	public Usuario() {
		super();
	}
	public Usuario(String login, String senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

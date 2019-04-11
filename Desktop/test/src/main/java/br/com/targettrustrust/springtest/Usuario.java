package br.com.targettrustrust.springtest;

@Entity
public class Usuario {
	
	@Id
	@GenerationValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String login;
	private String senha;
	private String nome;
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id ;
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

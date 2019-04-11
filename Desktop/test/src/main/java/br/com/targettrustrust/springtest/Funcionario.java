package br.com.targettrustrust.springtest;

@Entity
public class Funcionario {
	
	@id
	@GeneratedValue(strategy=GenerationType.Auto)
	private long id;
	
	@Column
	private String matricula;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	

}

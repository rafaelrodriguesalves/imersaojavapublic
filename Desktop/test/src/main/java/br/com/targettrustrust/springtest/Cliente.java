package br.com.targettrustrust.springtest;

public class Cliente {
	
	@id
	@GenerateValue (strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String endereco;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	

}

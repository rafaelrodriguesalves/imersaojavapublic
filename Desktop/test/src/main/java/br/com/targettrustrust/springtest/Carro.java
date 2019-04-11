package br.com.targettrustrust.springtest;


@Entity
public class Carro {
	
	@Id
	@GenerateValue (strategy=GenerationType.AUTO)
	private  long id;
	
	@Column
    private Integer portas ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getPortas() {
		return portas;
	}

	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	

}

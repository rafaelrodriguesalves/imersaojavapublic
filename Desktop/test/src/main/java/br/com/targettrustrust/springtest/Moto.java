package br.com.targettrustrust.springtest;


@Entity
public class Moto {
	@id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private integer cilindrada;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(integer cilindrada) {
		this.cilindrada = cilindrada;
	}

}

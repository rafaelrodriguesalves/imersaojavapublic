package br.com.targettrust.locadora.db;

import java.util.List;


import br.com.targettrust.locadora.entidades.Moto;


	public interface MotoRepository {
		void insertMoto (Moto moto);
		
		void updateMoto (Moto moto);
		
		List<Moto> listMoto();
		
		void delete (String cilindradas);
	

}

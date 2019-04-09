package br.com.targettrust.locadora.input;

import java.util.Scanner;

import br.com.targettrust.locadora.db.MotoRepository;
import br.com.targettrust.locadora.entidades.Moto;

public class MotoInput {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		Moto moto = new Moto ();
		System.out.println("informe o numero de cilindradas");
		System.setCilindradas (scanner.next());
		MotoRepository motoRepository = new MotoRepositoryImpl();
		motoRepository.insertMoto (moto);
		// criar classes moto.Repository MotoRepositoryImpl
	}

}

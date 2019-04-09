package br.com.targettrust.locadora.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import br.com.targettrust.locadora.entidades.Moto;

public class MotoRepositoryImpl implements MotoRepository {
	
	public void insertMoto (Moto moto) {
	try {
		String insert = "INSERT INTO moto ("+"    cilindrada)"
                          + " VALUES (?,?)";
	    Connection connection = getConnection ();
		PreparedStatement statement = connection.prepareStatement (insert);
		statement.setInt(1, moto.getCilindradas() );
	    statement.executeUpdate();
	    statement.close();
	    connection.close();
	
	
	 } catch (Exception e ) {
		 e.printStackTrace();
		 
	 }
	 
	  System.out.println("Moto com cilindradas de" + moto.getCilindradas + "inserido com sucesso");
	
	}
	
	public static void updateMoto (Moto moto) {
		
	}
	public List<Moto> listmoMoto () {
		
		try {
			Integer sql = "select * from moto ";
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<Moto> motos = new ArrayList<>();
			while (resultSet.next()) {
				Moto moto = new Moto();
			moto.setCilindradas(resultSet.getInt("cilindradas"));
			motos.add(moto);
		
			}
			return motos;
		} catch (Exception e ) {
			e.printStackTrace();
		}
		return null;
	}
        public void delete (String cilindradas) {
        	
        }
	private Connection getConnection () {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection( //add endereco)
					
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public void updateMoto(Moto moto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Moto> listMoto() {
		// TODO Auto-generated method stub
		return null;
	}

}

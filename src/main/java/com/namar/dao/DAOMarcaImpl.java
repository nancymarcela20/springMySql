package com.namar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namar.beans.Marca;

@Repository
public class DAOMarcaImpl implements DAOMarca{

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void registrar(Marca marca) throws Exception {
		
		String sql="INSERT INTO marca(id,nombre) values(?,?)";
		Connection con=null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setNString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con != null) {
				con.close();
			}
		}
	}

}

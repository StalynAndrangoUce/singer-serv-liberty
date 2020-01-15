package com.distribuida.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import javax.activation.DataSource;
import javax.sql.DataSource;
import javax.inject.Inject;

import com.distribuida.dto.Singer;

public class SingerServiceImpl implements SingerService {

	@Inject
	private DataSource dss;

	@SuppressWarnings("unchecked")
	@Override
	public List<Singer> listar() {

		List<Singer> singers = new ArrayList<>();
		String query = "SELECT * FROM singer;";
		try {
			Connection con = dss.getConnection();
			// Connection con = dss.getConnection();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Singer s = new Singer();
				s.setId(rs.getInt(1));
				s.setFirstName(rs.getString(2));
				// s.setFirst_name(rs.getString(2));
				s.setLastName(rs.getString(3));
				s.setBirthDate(rs.getDate(4));
				// s.setVersion(rs.getInt(5));
				singers.add(s);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return singers;
	}

	@Override
	public Singer buscarPorId(Integer id) {
		Singer singer = new Singer();
		String query = "SELECT * FROM singer WHERE id= ?";
		try {
			Connection con = dss.getConnection();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				/*
				 * singer.setId(rs.getInt(1)); singer.setBirth_date(rs.getDate(2));
				 * singer.setFirst_name(rs.getString(3)); singer.setLast_name(rs.getString(4));
				 */
				singer.setId(rs.getInt(1));
				singer.setFirstName(rs.getString(2));
				// s.setFirst_name(rs.getString(2));
				singer.setLastName(rs.getString(3));
				singer.setBirthDate(rs.getDate(4));
				// singer.setVersion(rs.getInt(5));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return singer;
	}
}

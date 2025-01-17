package com.exemplu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository

public class MasinaJdbcDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Masina> findAll(){
	String sql="select * from masini";
	return jdbcTemplate.query(sql, new MasinaMapper());
	}
	public Masina findById(String numarInmatriculare){
	String sql="select * from masini where numar_inmatriculare=?";
	return jdbcTemplate.queryForObject(sql,new MasinaMapper(),numarInmatriculare);
	}
	public int deleteById(String numarInmatriculare){
	String sql="delete from masini where numar_inmatriculare=?";
	return jdbcTemplate.update(sql, numarInmatriculare);
	}
	
	public int insert(Masina p){
	String sql="insert into masini values(?,?,?,?,?)";
	return jdbcTemplate.update(sql, p.getNumarInmatriculare(),p.getMarca(),p.getAnulFabricatiei(),p.getCuloarea(),p.getNumarKm());
	}
	public int update(Masina p){
	String sql="update masini set numar_inmatriculare=?,marca=?,anul_fabricatiei=?,culoarea=?,numar_km=? where id=?";
	return jdbcTemplate.update(sql, p.getNumarInmatriculare(),p.getMarca(),p.getAnulFabricatiei(),p.getCuloarea(),p.getNumarKm());
	}
	}


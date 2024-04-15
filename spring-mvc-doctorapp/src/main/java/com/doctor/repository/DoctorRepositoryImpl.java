package com.doctor.repository;

import com.doctor.model.Doctor;
import com.doctor.util.DoctorDb;
import com.doctor.util.Queries;

import java.beans.Expression;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Object[] doctorArr = {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getExperience(),doctor.getRatings(),doctor.getFees()};
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArr);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UPDATEQUERY,doctorId,fees);
	}

	@Override
	public void deleteDoctor(int doctorID) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DELETEQUERY,doctorID);
	}

	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYID,mapper, doctorId);
		return (Doctor) doctor;
		
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDALLQUERY,mapper);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor =jdbcTemplate.query(Queries.FINDBYSPECIALITY,mapper,speciality);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor =jdbcTemplate.query(Queries.FINDBYSPECANDEXP,mapper,speciality, experience);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, int fees) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor =jdbcTemplate.query(Queries.FINDBYSPECANDFEES,mapper,speciality, fees);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor =jdbcTemplate.query(Queries.FINDBYSPECANDRATINGS,mapper,speciality, ratings);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, int doctorName) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor =jdbcTemplate.query(Queries.FINDBYSPECANDNAME,mapper,speciality, doctorName);
		return doctor;
	}

	
   
}

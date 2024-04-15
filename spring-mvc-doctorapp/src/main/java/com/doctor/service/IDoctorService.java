package com.doctor.service;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.exceptions.IdNotFoundException;
import com.doctor.model.Doctor;

import javax.print.Doc;
import java.util.List;

public interface IDoctorService {
    
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double fees);
    void deleteDoctor(int doctorID);
    Doctor getById(int doctorId) throws IdNotFoundException;
    
    List<Doctor> getAll();
    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLessFees(String speciality, int fees) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality, int doctorName)throws  DoctorNotFoundException;
    
    
    
    
}

package com.doctor.repository;

import com.doctor.model.Doctor;

import java.util.List;

public interface IDoctorRepository {

    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double fees);
    void deleteDoctor(int doctorID);
    Doctor findById(int doctorId);

    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality);
    List<Doctor> findBySpecialityAndExp(String speciality, int experience);
    List<Doctor> findBySpecialityAndLessFees(String speciality, int fees);
    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings);
    List<Doctor> findBySpecialityAndNameContains(String speciality, int doctorName);

}

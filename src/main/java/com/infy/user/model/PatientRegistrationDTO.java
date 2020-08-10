package com.infy.user.model;

import java.util.ArrayList;
import java.util.List;

import com.infy.user.entities.PatientRegistration;

public class PatientRegistrationDTO {
	private String patientId;
	private PatientRegistrationDetail patientRegistrationDetail;
	private PatientPhysicalAndMedicalDetails patientPhysicalAndMedicalDetails;
	private DoctorDetailDTO doctorDetailDTO;
	private ArrayList<CovidData> covidDataList;
	public DoctorDetailDTO getDoctorDetailDTO() {
		return doctorDetailDTO;
	}
	public void setDoctorDetailDTO(DoctorDetailDTO doctorDetailDTO) {
		this.doctorDetailDTO = doctorDetailDTO;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public PatientPhysicalAndMedicalDetails getPatientPhysicalAndMedicalDetails() {
		return patientPhysicalAndMedicalDetails;
	}
	public void setPatientPhysicalAndMedicalDetails(PatientPhysicalAndMedicalDetails patientPhysicalAndMedicalDetails) {
		this.patientPhysicalAndMedicalDetails = patientPhysicalAndMedicalDetails;
	}
	
	public PatientRegistrationDetail getPatientRegistrationDetail() {
		return patientRegistrationDetail;
	}
	public void setPatientRegistrationDetail(PatientRegistrationDetail patientRegistrationDetail) {
		this.patientRegistrationDetail = patientRegistrationDetail;
	}
	public ArrayList<CovidData> getCovidDataList() {
		return covidDataList;
	}
	public void setCovidDataList(ArrayList<CovidData> covidDataList) {
		this.covidDataList = covidDataList;
	}
	public static PatientRegistration patientRegistrationDTOConvertPatientRegistrationDTO(PatientRegistrationDTO patientRegistrationDTO) {
		PatientRegistration patientRegistration = new PatientRegistration();
		patientRegistration.setPatientId(patientRegistrationDTO.getPatientId());
		patientRegistration.setPatientPhysicalAndMedicalDetails(patientRegistrationDTO.getPatientPhysicalAndMedicalDetails());
		patientRegistration.setPatientRegistrationDetail(patientRegistrationDTO.getPatientRegistrationDetail());
		patientRegistration.setCovidDataList(patientRegistrationDTO.getCovidDataList());
		if(patientRegistrationDTO.getDoctorDetailDTO()!=null)
		patientRegistration.setDoctorDetail(DoctorDetailDTO.doctorDetailDTOConvertDoctorDetail(patientRegistrationDTO.getDoctorDetailDTO()));
		return patientRegistration;
	}
	public static PatientRegistrationDTO patientRegistrationConvertPatientRegistrationDTO(PatientRegistration patientRegistration) {
		PatientRegistrationDTO patientRegistrationDTO = new PatientRegistrationDTO();
		patientRegistrationDTO.setPatientId(patientRegistration.getPatientId());
		patientRegistrationDTO.setPatientPhysicalAndMedicalDetails(patientRegistration.getPatientPhysicalAndMedicalDetails());
		patientRegistrationDTO.setPatientRegistrationDetail(patientRegistration.getPatientRegistrationDetail());
		patientRegistrationDTO.setCovidDataList(patientRegistration.getCovidDataList());
		if(patientRegistration.getDoctorDetail()!=null)
		patientRegistrationDTO.setDoctorDetailDTO(DoctorDetailDTO.doctorDetailConvertDoctorDetailDTO(patientRegistration.getDoctorDetail()));
		return patientRegistrationDTO;
	}
}

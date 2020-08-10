package com.infy.user.model;

import com.infy.user.entities.DoctorDetail;

public class DoctorDetailDTO {
	private String doctorId;
	private String doctorName;
	private String email;
	private String password;
	private String qualification;
	private String hospitalName;
	private String specialist;
	private String city;
	private String state;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static DoctorDetail doctorDetailDTOConvertDoctorDetail(DoctorDetailDTO doctorDetailDTO) {
		DoctorDetail doctorDetail = new DoctorDetail();
		doctorDetail.setDoctorId(doctorDetailDTO.getDoctorId());
		doctorDetail.setDoctorName(doctorDetailDTO.getDoctorName());
		doctorDetail.setEmail(doctorDetailDTO.getEmail());
		doctorDetail.setPassword(doctorDetailDTO.getPassword());
		doctorDetail.setQualification(doctorDetailDTO.getQualification());
		doctorDetail.setSpecialist(doctorDetailDTO.getSpecialist());
		doctorDetail.setHospitalName(doctorDetailDTO.getHospitalName());
		doctorDetail.setCity(doctorDetailDTO.getCity());
		doctorDetail.setState(doctorDetailDTO.getState());
		return doctorDetail;
	}
	public static DoctorDetailDTO doctorDetailConvertDoctorDetailDTO(DoctorDetail doctorDetail) {
		DoctorDetailDTO doctorDetailDTO = new DoctorDetailDTO();
		doctorDetailDTO.setDoctorId(doctorDetail.getDoctorId());
		doctorDetailDTO.setDoctorName(doctorDetail.getDoctorName());
		doctorDetailDTO.setEmail(doctorDetail.getEmail());
		doctorDetailDTO.setPassword(doctorDetail.getPassword());
		doctorDetailDTO.setQualification(doctorDetail.getQualification());
		doctorDetailDTO.setSpecialist(doctorDetail.getSpecialist());
		doctorDetailDTO.setHospitalName(doctorDetail.getHospitalName());
		doctorDetailDTO.setCity(doctorDetail.getCity());
		doctorDetailDTO.setState(doctorDetail.getState());
		return doctorDetailDTO;
	}
}

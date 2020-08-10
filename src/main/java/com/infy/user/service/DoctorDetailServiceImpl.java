package com.infy.user.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.user.entities.DoctorDetail;
import com.infy.user.model.DoctorDetailDTO;
import com.infy.user.model.Login;
import com.infy.user.repository.DoctorDetailRepository;
@Service
public class DoctorDetailServiceImpl {
	@Autowired
	DoctorDetailRepository doctorDetailRepository;
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	public String addDoctor(DoctorDetailDTO doctorDetailDTO) {
		DoctorDetail doctorDetail = DoctorDetailDTO.doctorDetailDTOConvertDoctorDetail(doctorDetailDTO);
		doctorDetail.setDoctorId("D"+sequenceGeneratorService.generateSequence(DoctorDetail.getSequence()));
		doctorDetail= doctorDetailRepository.save(doctorDetail);
		 return doctorDetail.getDoctorId();
	}
	public DoctorDetailDTO getDoctorById(String doctorId) throws Exception {
		DoctorDetail doctorDetail = doctorDetailRepository.findById(doctorId).orElseThrow( ()->new Exception("doctor is not Found with id"));
		return DoctorDetailDTO.doctorDetailConvertDoctorDetailDTO(doctorDetail);
	}
	public DoctorDetailDTO getDoctor(Login login) throws Exception{
		DoctorDetail doctorDetail = doctorDetailRepository.findByEmailAndPassword(login.getEmail(),login.getPassword()).orElseThrow( ()->new Exception("doctor is not Found with id"));
		return DoctorDetailDTO.doctorDetailConvertDoctorDetailDTO(doctorDetail);
	}
	public List<DoctorDetailDTO> getDoctorByCity(String city) throws Exception {
		List<DoctorDetail> doctorDetails = doctorDetailRepository.findByCity(city);
		if(doctorDetails.isEmpty())
			throw new Exception("no doctor available in this city");
		List<DoctorDetailDTO> doctorDetailDTOs= new ArrayList<>();
		for (DoctorDetail doctorDetail : doctorDetails) {
			DoctorDetailDTO doctorDetailDTO = DoctorDetailDTO.doctorDetailConvertDoctorDetailDTO(doctorDetail);
			doctorDetailDTOs.add(doctorDetailDTO);
		}
		return doctorDetailDTOs;
	}
	public List<DoctorDetailDTO> getDoctorBySpecialist(String specialist) throws Exception {
		List<DoctorDetail> doctorDetails = doctorDetailRepository.findBySpecialist(specialist);
		if(doctorDetails.isEmpty())
			throw new Exception("no doctor availble for that Specialization");
		List<DoctorDetailDTO> doctorDetailDTOs= new ArrayList<>();
		for (DoctorDetail doctorDetail : doctorDetails) {
			DoctorDetailDTO doctorDetailDTO = DoctorDetailDTO.doctorDetailConvertDoctorDetailDTO(doctorDetail);
			doctorDetailDTOs.add(doctorDetailDTO);
		}
		return doctorDetailDTOs;
	}
	public List<String> getCity(String state) throws Exception{
		List<DoctorDetail> doctorDetails= doctorDetailRepository.findByStateDistinct(state);
		if(doctorDetails.isEmpty())
			throw new Exception("No doctor available in this state");
		Set<String> cities= new HashSet<>();
		for(DoctorDetail doctorDetail:doctorDetails) {
			cities.add(doctorDetail.getCity());
		}
		return cities.stream().collect(Collectors.toList());
		
	}
}

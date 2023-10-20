package com.exp.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.spring.entity.Student;
import com.exp.spring.entity.Trainer;
import com.exp.spring.repository.TrainerRepository;

@Service
public class TrainerService {
@Autowired
	private TrainerRepository trainerRepository;
	
	

	public List<Trainer> getAllTrainer() {
		return trainerRepository.findAll();
	}	
@RequestMapping
	public Trainer addTrainer(Trainer T) {
		return trainerRepository.save(T);
		
	}
public void deleteTrainer(int id) {
	trainerRepository.deleteById(id);
	}
public Trainer getTrainerbyID(int id) {

	return trainerRepository.findById(id).get();

	}
public List<Trainer> getTrainerbyName(String ename)
{
	return this.trainerRepository.findByName(ename);	
}

public Trainer updateTrainer(int id,Trainer S) {
	S.setid(id);
	return trainerRepository.save(S);
}


}
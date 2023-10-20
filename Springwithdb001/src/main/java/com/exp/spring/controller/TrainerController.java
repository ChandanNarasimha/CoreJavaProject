package com.exp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.spring.entity.Student;
import com.exp.spring.entity.Trainer;
import com.exp.spring.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
@Autowired
 	private  TrainerService trainerservice;
@GetMapping("/all")
	public List<Trainer>getdata(){
		return this.trainerservice.getAllTrainer();
	
}
@PostMapping("/add")
public Trainer addTrainer(@RequestBody Trainer T) {
return this.trainerservice.addTrainer(T);

}
@DeleteMapping("/dldata/{id}")
public void deleteTrainer(@PathVariable int id) {
	trainerservice.deleteTrainer(id);
}
@GetMapping("/get/{id}")

public Trainer getById(@PathVariable int id) {

return this.trainerservice.getTrainerbyID(id);

}
@GetMapping("/search/{ename}")
public List<Trainer>findByname(@PathVariable String ename)
{
	return this.trainerservice.getTrainerbyName(ename);

}
@PutMapping("/update/{id}")
public Trainer updateTrainer(@PathVariable int id,@RequestBody Trainer T) {
	return trainerservice.updateTrainer(id, T);
}
}

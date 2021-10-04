package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class HelloController{
	@Autowired
	private Repo repo;


	@PostMapping("/add")
	public Model AddString(@RequestBody Model model) {
		repo.save(model);
		return model;
	}

	@GetMapping("/str/{id}")
	public List<Model> findStringById(@PathVariable Integer id){
//		return repo.findAll();
		return null;

	}
	@RequestMapping("/Hello")
	public String getFoosBySimplePath() {
		return "Get some Foos";
	}
}
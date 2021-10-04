package com.example.springboot;

import com.example.springboot.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class HelloController{
	private Repo repo;

	@PostMapping(value = "/add", produces = { "application/json; charset=utf-8" })
	public String AddString(@RequestBody Model model) {
		repo.save(model);
		return "Sucks ass!";
	}

	@GetMapping("/str/{id}")
	public Model findStringById(@PathVariable Integer id){
		return repo.findStringById(id);

	}
	@RequestMapping("/Hello")
	public String getFoosBySimplePath() {
		return "Get some Foos";
	}
}
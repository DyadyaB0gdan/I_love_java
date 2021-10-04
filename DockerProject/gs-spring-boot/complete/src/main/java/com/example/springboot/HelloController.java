package com.example.springboot;

import com.example.springboot.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController{
	@Autowired
	private Repo repo;

	@PostMapping("/add")
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